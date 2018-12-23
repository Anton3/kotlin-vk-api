package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
    httpClient = httpClient,
    responseType = jacksonTypeRef()
) {
    override suspend fun iteratorToUrl(iterator: LongPollServer): String {
        return "${iterator.server}?act=a_check&key=${iterator.key}&ts=${iterator.ts}&wait=$timeout&version=3"
    }

    override suspend fun iteratorWithTs(iterator: LongPollServer, ts: Long): LongPollServer {
        return iterator.copy(ts = ts)
    }

    override suspend fun iterator(): LongPollServer {
        return api(GroupsGetLongPollServer(groupId = groupId))
    }
}

fun CoroutineScope.groupLongPollEvents(
    api: VkClient<GroupMethod>,
    httpClient: TransportClient = api.httpClient,
    timeout: Int
): ReceiveChannel<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, api, api.token.id, httpClient, timeout).produceEvents(this)

fun CoroutineScope.groupLongPollEventsAsAdmin(
    api: VkClient<UserMethod>,
    groupId: Long,
    httpClient: TransportClient = api.httpClient,
    timeout: Int
): ReceiveChannel<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, api, groupId, httpClient, timeout).produceEvents(this)
