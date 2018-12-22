package name.anton3.vkapi.methods.longpoll

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.generated.messages.methods.MessagesGetLongPollServer
import name.anton3.vkapi.generated.messages.objects.LongpollParams
import name.anton3.vkapi.methods.longpoll.events.LongPollEvent
import name.anton3.vkapi.tokens.GroupMethod
import name.anton3.vkapi.tokens.UserGroupMethod
import name.anton3.vkapi.tokens.UserMethod

class UserLongPollEventSource(
    private val api: VkClient<UserGroupMethod>,
    private val groupId: Long?,
    httpClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<LongPollEvent, LongpollParams>(
    objectMapper = api.objectMapper,
    httpClient = httpClient
) {
    override suspend fun iteratorToUrl(iterator: LongpollParams): String {
        return "https://${iterator.server}?act=a_check&key=${iterator.key}" +
                "&ts=${iterator.ts}&wait=$timeout&mode=${2 + 8 + 64}&version=3"
    }

    override suspend fun iteratorWithTs(iterator: LongpollParams, ts: Long): LongpollParams {
        return iterator.copy(ts = ts)
    }

    override suspend fun iterator(): LongpollParams {
        return api(MessagesGetLongPollServer(lpVersion = 3L).also {
            if (groupId != null) it.groupId = groupId
        })
    }
}

fun VkClient<GroupMethod>.messageLongPollEvents(
    scope: CoroutineScope,
    httpClient: TransportClient = this.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(this, null, httpClient, timeout).produceEvents(scope)

fun VkClient<UserMethod>.messageLongPollEventsAsAdmin(
    groupId: Long,
    scope: CoroutineScope,
    httpClient: TransportClient = this.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(this, groupId, httpClient, timeout).produceEvents(scope)

fun VkClient<UserMethod>.messageLongPollEventsForUser(
    scope: CoroutineScope,
    httpClient: TransportClient = this.httpClient,
    timeout: Int
): ReceiveChannel<LongPollEvent> =
    UserLongPollEventSource(this, null, httpClient, timeout).produceEvents(scope)
