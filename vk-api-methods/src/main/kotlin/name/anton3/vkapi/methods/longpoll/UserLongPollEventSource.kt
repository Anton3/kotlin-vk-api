package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
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
    transportClient: TransportClient,
    private val groupId: Int?,
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
        return api(MessagesGetLongPollServer(lpVersion = 3, groupId = groupId))
    }
}

/**
 * Receive limited message events for a group in User LongPoll format.
 * Chat messages are not accessible this way.
 *
 * @param api Client to request a LongPoll server
 *
 * @param timeoutSeconds Time, after which VK server must respond, even if no events occurred.
 * Should be less than timeout of `transportClient`
 *
 * @param transportClient You might want to supply a custom http client with extended
 *
 * @return Unbuffered flow, consider using `async`, `launch` and/or `Flow.buffer` for parallel processing
 *
 * @see messageLongPollEventsAsAdmin
 */
fun messageLongPollEvents(
    api: GroupClient,
    timeoutSeconds: Int = 8,
    transportClient: TransportClient = api.transportClient
): Flow<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, transportClient, null, timeoutSeconds).produceEvents()

/**
 * Same as `messageLongPollEvents`, but called with the token of an admin user.
 *
 * @see messageLongPollEvents
 */
fun messageLongPollEventsAsAdmin(
    api: UserClient,
    groupId: Int,
    timeoutSeconds: Int = 8,
    transportClient: TransportClient = api.transportClient
): Flow<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, transportClient, groupId, timeoutSeconds).produceEvents()

/**
 * Receive User LongPoll events.
 *
 * @param api Client to request a LongPoll server
 *
 * @param timeoutSeconds Time, after which VK server must respond, even if no events occurred.
 * Should be less than timeout of `transportClient`
 *
 * @param transportClient You might want to supply a custom http client with extended
 *
 * @return Unbuffered flow, consider using `async`, `launch` and/or `Flow.buffer` for parallel processing
 */
fun messageLongPollEventsForUser(
    api: UserClient,
    timeoutSeconds: Int = 8,
    transportClient: TransportClient = api.transportClient
): Flow<LongPollEvent> =
    UserLongPollEventSource(Dispatchers.IO, api, transportClient, null, timeoutSeconds).produceEvents()
