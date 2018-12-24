package name.anton3.vkapi.generated.apps.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetPlatform(@get:JsonValue val value: String) {
    WEB("web"),
    IOS("ios"),
    ANDROID("android"),
    WINPHONE("winphone")
}
