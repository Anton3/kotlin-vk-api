package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ReceiveChannel
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.generated.groups.methods.GroupsGetLongPollServer
import name.anton3.vkapi.generated.groups.objects.LongPollServer
import name.anton3.vkapi.methods.callback.CallbackEvent
import name.anton3.vkapi.tokens.GroupMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.tokens.UserMethod
import kotlin.coroutines.CoroutineContext

class GroupLongPollEventSource(
    longPollContext: CoroutineContext,
    private val api: VkClient<UserGroupMethod>,
    private val groupId: Long,
    httpClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<CallbackEvent<*>, LongPollServer>(
    longPollContext = longPollContext,
    objectMapper = api.objectMapper,
    httpClient = httpClient
) {
    override suspend fun iteratorToUrl(iterator: LongPollServer): String {
        return "${iterator.server}?act=a_check&key=${iterator.key}&ts=${iterator.ts}&wait=$timeout"
    }

    override suspend fun iteratorWithTs(iterator: LongPollServer, ts: Long): LongPollServer {
        return iterator.copy(ts = ts)
    }

    override suspend fun iterator(): LongPollServer {
        return api(GroupsGetLongPollServer(groupId = groupId))
    }
}

fun VkClient<GroupMethod>.groupLongPollEvents(
    scope: CoroutineScope,
    httpClient: TransportClient = this.httpClient,
    timeout: Int
): ReceiveChannel<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, this, this.token.id, httpClient, timeout).produceEvents(scope)

fun VkClient<UserMethod>.groupLongPollEventsAsAdmin(
    groupId: Long,
    scope: CoroutineScope,
    httpClient: TransportClient = this.httpClient,
    timeout: Int
): ReceiveChannel<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, this, groupId, httpClient, timeout).produceEvents(scope)
