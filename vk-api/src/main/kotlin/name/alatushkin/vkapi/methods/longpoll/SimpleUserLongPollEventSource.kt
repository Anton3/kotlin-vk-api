package name.alatushkin.vkapi.methods.longpoll

import com.fasterxml.jackson.module.kotlin.readValue
import mu.KotlinLogging
import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.core.TransportClient
import name.alatushkin.vkapi.core.get
import name.alatushkin.vkapi.generated.messages.methods.MessagesGetLongPollServer
import name.alatushkin.vkapi.generated.messages.objects.LongpollParams
import name.alatushkin.vkapi.methods.longpoll.events.LongPollEvent
import name.alatushkin.vkapi.methods.longpoll.objects.LongPollFailure
import name.alatushkin.vkapi.tokens.GroupMethod
import java.net.SocketTimeoutException
import java.nio.charset.Charset

private val log = KotlinLogging.logger {}

class SimpleUserLongPollEventSource(
    private val api: VkClient<GroupMethod>,
    private val httpClient: TransportClient = api.httpClient,
    private val timeOut: Int
) {
    private val groupId = api.token.id

    suspend fun getEvents(iterator: LongpollParams? = null): Pair<LongpollParams, List<LongPollEvent>> {

        val lpServer = iterator ?: getLongPollServer()

        try {
            val vkJson = try {
                httpClient.get(lpServer.toUrl(timeOut)).data.toString(Charset.forName("UTF-8"))
            } catch (e: SocketTimeoutException) {
                return lpServer to emptyList()
            } catch (e: Exception) {
                log.debug("Vk long poll failed to get response", e)
                return lpServer to emptyList()
            }
            log.debug("Vk long poll responds with $vkJson")
            val lpResponse: LongPollResponse = api.objectMapper.readValue(vkJson)

            return when (lpResponse.failed) {
                null -> {
                    lpServer.copy(ts = lpResponse.ts) to lpResponse.updates
                }
                LongPollFailure.NEW_TS -> {
                    log.debug("Vk say failed:1. Old ts:{} new ts: {}", lpServer.ts, lpResponse.ts)
                    lpServer.copy(ts = lpResponse.ts) to emptyList()
                }
                LongPollFailure.REQUEST_NEW_KEY -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:2. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    newServer to emptyList()
                }
                LongPollFailure.REQUEST_NEW_KEY_TS -> {
                    val newServer = getLongPollServer()
                    log.debug("Vk say failed:3. Old ts:{} new ts: {}", lpServer.ts, newServer.ts)
                    newServer to emptyList()
                }
                LongPollFailure.INVALID_VERSION -> {
                    error("Invalid version")
                }
            }
        } catch (e: Exception) {
            log.error("Some error occurs {}", e.message)
            log.error("{}", e)
            return lpServer to emptyList()
        }
    }

    private suspend fun getLongPollServer(): LongpollParams {
        return api(MessagesGetLongPollServer(groupId = groupId, needPts = true, lpVersion = 3L))
    }
}

fun LongpollParams.toUrl(timeOut: Int = 95): String {
    return "https://$server?act=a_check&key=$key&ts=$ts&wait=$timeOut&mode=${2 + 8 + 64}&version=3"
}

fun LongpollParams.dump(): String {
    return "LongPollServer(server=$server,key=$key,ts=$ts)"
}
