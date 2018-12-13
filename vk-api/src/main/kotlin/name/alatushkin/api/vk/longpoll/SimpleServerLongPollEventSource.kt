package name.alatushkin.api.vk.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import name.alatushkin.api.vk.callback.CallbackEvent
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetLongPollServer
import name.alatushkin.api.vk.generated.groups.objects.LongPollServer
import name.alatushkin.api.vk.json.VK_OBJECT_MAPPER
import name.alatushkin.api.vk.tokens.GroupMethod
import name.alatushkin.api.vk.tokens.VkClient
import name.alatushkin.api.vk.tokens.invoke
import name.alatushkin.httpclient.HttpClient
import name.alatushkin.httpclient.HttpMethod
import org.slf4j.LoggerFactory
import java.net.SocketTimeoutException
import java.nio.charset.Charset

class SimpleServerLongPollEventSource(
        private val api: VkClient<GroupMethod>,
        private val httpClient: HttpClient = api.httpClient,
        private val timeOut: Int
) {
    private val groupId = api.token.id

    suspend fun getEvents(iterator: LongPollServer? = null): Pair<LongPollServer, List<CallbackEvent<*>>> {

        val lpServer = iterator ?: getLongPollServer()

        try {
            val vkJson = try {
                httpClient(HttpMethod.GET(lpServer.toUrl(timeOut))).data.toString(Charset.forName("UTF-8"))
            } catch (e: SocketTimeoutException) {
                return lpServer to emptyList()
            } catch (e: Exception) {
                log.debug("Vk long poll failed to get response", e)
                return lpServer to emptyList()
            }
            log.debug("Vk long poll responds with $vkJson")
            val lpResponse: GroupLongPollResponse = VK_OBJECT_MAPPER.readValue(vkJson)

            when (lpResponse.failed) {
                1 -> {
                    log.debug("Vk say failed:1. Old ts:{} new ts: {}", lpServer.ts, lpResponse.ts)
                    return lpServer.copy(ts = lpResponse.ts) to emptyList()
                }
                2 -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:2. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    return newServer to emptyList()
                }
                3 -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:3. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    return newServer to emptyList()
                }
            }

            return lpServer.copy(ts = lpResponse.ts) to lpResponse.updates

        } catch (e: Exception) {
            log.error("Some error occurs {}", e.message)
            log.error("{}", e)
            return lpServer to emptyList()
        }
    }

    private suspend fun getLongPollServer(): LongPollServer {
        return api(GroupsGetLongPollServer(groupId))
    }

    companion object {
        val log = LoggerFactory.getLogger(SimpleUserLongPollEventSource::class.java)!!
    }
}

fun LongPollServer.toUrl(timeOut: Int = 95): String {
    return "$server?act=a_check&key=$key&ts=$ts&wait=$timeOut"
}

fun LongPollServer.dump(): String {
    return "LongPollServer(server=$server,key=$key,ts=$ts)"
}
