package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.ReceiveChannel
import name.anton3.vkapi.client.GroupClient
import name.anton3.vkapi.client.UserClient
import name.anton3.vkapi.client.UserGroupClient
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.generated.messages.methods.MessagesGetLongPollServer
import name.anton3.vkapi.generated.messages.objects.LongpollParams
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import kotlin.coroutines.CoroutineContext

class UserLongPollEventSource(
    longPollContext: CoroutineContext,
    private val api: UserGroupClient,
    private val groupId: Int?,
    httpClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<LongPollEvent, LongpollParams>(
    longPollContext = longPollContext,
    objectMapper = api.objectMapper,
    httpClient = httpClient,
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
    api: GroupClient,
    httpClient: TransportClient = api.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api.userGroup, null, httpClient, timeout).produceEvents(this)

fun CoroutineScope.messageLongPollEventsAsAdmin(
    api: UserClient,
    groupId: Int,
    httpClient: TransportClient = api.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api.userGroup, groupId, httpClient, timeout).produceEvents(this)

fun CoroutineScope.messageLongPollEventsForUser(
    api: UserClient,
    httpClient: TransportClient = api.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api.userGroup, null, httpClient, timeout).produceEvents(this)
