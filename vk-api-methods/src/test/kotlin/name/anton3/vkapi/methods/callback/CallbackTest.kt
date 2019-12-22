package name.anton3.vkapi.methods.callback

import com.fasterxml.jackson.module.kotlin.readValue
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.request.receive
import io.ktor.response.respondText
import io.ktor.routing.post
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.time.delay
import name.anton3.vkapi.utils.callbackConfirmationCode
import name.anton3.vkapi.utils.groupApi
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import java.time.Duration

class CallbackTest {
    @Test
    @Disabled
    fun `Use Bot Callback API to receive group events`(): Unit = runBlocking<Unit>(Dispatchers.Default) {
        val server = embeddedServer(Netty, port = 8080) {
            routing {
                post("/") {
                    val bytes = call.receive<ByteArray>()
                    val event = groupApi.objectMapper.readValue<CallbackEvent<*>>(bytes)
                    processEvent(event)
                    val response = if (event is CallbackConfirmationRequest) callbackConfirmationCode else "ok"
                    call.respondText(response, ContentType.Text.Plain)
                }
            }
        }

        server.start(wait = false)
        delay(Duration.ofSeconds(10))
        server.stop(3000, 5000)
    }

    private fun processEvent(event: CallbackEvent<*>) {
        println(event.attachment)
    }
}
