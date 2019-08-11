package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ReceiveChannel
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.generated.groups.methods.GroupsGetLongPollServer
import name.anton3.vkapi.generated.groups.objects.LongPollServer
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.methods.callback.CallbackEvent
import kotlin.coroutines.CoroutineContext

class GroupLongPollEventSource(
    longPollContext: CoroutineContext,
    private val api: VkClient<UserGroupMethod>,
    private val groupId: Int,
    transportClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<CallbackEvent<*>, LongPollServer>(
    longPollContext = longPollContext,
    objectMapper = api.objectMapper,
    transportClient = transportClient,
    responseType = jacksonTypeRef()
) {
    override suspend fun iteratorToUrl(iterator: LongPollServer): String {
        return "${iterator.server}?act=a_check&key=${iterator.key}&ts=${iterator.ts}&wait=$timeout&version=3"
    }

    override suspend fun iteratorWithTs(iterator: LongPollServer, ts: Int): LongPollServer {
        return iterator.copy(ts = ts)
    }

    override suspend fun iterator(): LongPollServer {
        return api(GroupsGetLongPollServer(groupId = groupId))
    }
}

fun CoroutineScope.groupLongPollEvents(
    api: VkClient<UserGroupMethod>,
    groupId: Int,
    timeout: Int,
    transportClient: TransportClient = api.transportClient
): ReceiveChannel<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, api, groupId, transportClient, timeout).produceEvents(this)
