@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetPlatform(override val value: String) : ValueEnum<String> {
    WEB("web"),
    IOS("ios"),
    ANDROID("android"),
    WINPHONE("winphone")
}
