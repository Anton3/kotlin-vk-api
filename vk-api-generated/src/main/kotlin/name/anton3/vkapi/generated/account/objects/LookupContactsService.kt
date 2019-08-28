@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class LookupContactsService(override val value: String) : ValueEnum<String> {
    EMAIL("email"),
    PHONE("phone"),
    TWITTER("twitter"),
    FACEBOOK("facebook"),
    ODNOKLASSNIKI("odnoklassniki"),
    INSTAGRAM("instagram"),
    GOOGLE("google")
}
