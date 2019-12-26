package name.anton3.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import name.anton3.vkapi.client.UserGroupClient
import name.anton3.vkapi.transport.TransportClient
import name.anton3.vkapi.generated.groups.methods.GroupsGetLongPollServer
import name.anton3.vkapi.generated.groups.objects.LongPollServer
import name.anton3.vkapi.methods.callback.CallbackEvent
import kotlin.coroutines.CoroutineContext

class GroupLongPollEventSource(
    longPollContext: CoroutineContext,
    private val api: UserGroupClient,
    private val groupId: Int,
    transportClient: TransportClient,
    private val timeout: Int
) : AbstractLongPollEventSource<CallbackEvent<*>, LongPollServer>(
    longPollContext = longPollContext,
    objectMapper = api.objectMapper,
    transportClient = transportClient,
    responseType = jacksonTypeRef()
) {
    init {
        require(timeout in 1..90) { "Maximum LongPoll wait value is 90 seconds, got: $timeout" }
    }

    override suspend fun iteratorToUrl(iterator: LongPollServer): String {
        return "${iterator.server}?act=a_check&key=${iterator.key}&ts=${iterator.ts}&wait=$timeout&version=3"
    }

    override suspend fun iteratorWithTs(iterator: LongPollServer, ts: Int): LongPollServer {
        return iterator.copy(ts = ts.toString())
    }

    override suspend fun iterator(): LongPollServer {
        return api(GroupsGetLongPollServer(groupId = groupId))
    }
}

/**
 * Primary source for Bot LongPoll events
 *
 * @param api Client to request a LongPoll server
 *
 * @param groupId Group ID corresponding to `api`
 *
 * @param wait Time after which LongPoll server must respond, even if no events occurred.
 * Should be less than timeout of `transportClient`. Maximum allowed value is 90.
 *
 * @param transportClient You might want to supply a custom http client with extended
 *
 * @return Unbuffered flow, consider using `async`, `launch` and/or `Flow.buffer` for parallel processing
 */
fun groupLongPollEvents(
    api: UserGroupClient,
    groupId: Int,
    wait: Int = 8,
    transportClient: TransportClient = api.transportClient
): Flow<CallbackEvent<*>> =
    GroupLongPollEventSource(Dispatchers.IO, api, groupId, transportClient, wait).produceEvents()
