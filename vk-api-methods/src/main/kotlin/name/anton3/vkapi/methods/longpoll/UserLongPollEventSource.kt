package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ReceiveChannel
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.generated.messages.methods.MessagesGetLongPollServer
import name.anton3.vkapi.generated.messages.objects.LongpollParams
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import kotlin.coroutines.CoroutineContext

class UserLongPollEventSource(
    longPollContext: CoroutineContext,
    private val api: VkClient<UserGroupMethod>,
    private val groupId: Int?,
    transportClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<LongPollEvent, LongpollParams>(
    longPollContext = longPollContext,
    objectMapper = api.objectMapper,
    transportClient = transportClient,
    responseType = jacksonTypeRef()
) {
    override suspend fun iteratorToUrl(iterator: LongpollParams): String {
        return "https://${iterator.server}?act=a_check&key=${iterator.key}&ts=${iterator.ts}&wait=$timeout&mode=${2 + 8 + 64}&version=3"
    }

    override suspend fun iteratorWithTs(iterator: LongpollParams, ts: Int): LongpollParams {
        return iterator.copy(ts = ts)
    }

    override suspend fun iterator(): LongpollParams {
        return api(MessagesGetLongPollServer(lpVersion = 3).also {
            if (groupId != null) it.groupId = groupId
        })
    }
}

fun CoroutineScope.messageLongPollEvents(
    api: VkClient<GroupMethod>,
    transportClient: TransportClient = api.transportClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, null, transportClient, timeout).produceEvents(this)

fun CoroutineScope.messageLongPollEventsAsAdmin(
    api: VkClient<UserMethod>,
    groupId: Int,
    transportClient: TransportClient = api.transportClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, groupId, transportClient, timeout).produceEvents(this)

fun CoroutineScope.messageLongPollEventsForUser(
    api: VkClient<UserMethod>,
    transportClient: TransportClient = api.transportClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, null, transportClient, timeout).produceEvents(this)
