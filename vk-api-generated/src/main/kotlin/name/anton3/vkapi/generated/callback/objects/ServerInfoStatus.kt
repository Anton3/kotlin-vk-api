package name.anton3.vkapi.generated.callback.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class ServerInfoStatus(@get:JsonValue val value: String) {
    UNCONFIGURED("unconfigured"),
    FAIL("fail"),
    WAIT("wait"),
    OK("ok")
}
