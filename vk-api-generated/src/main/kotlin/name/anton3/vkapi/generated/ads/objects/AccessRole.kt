@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.ads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class AccessRole(override val value: String) : ValueEnum<String> {
    ADMIN("admin"),
    MANAGER("manager"),
    REPORTS("reports")
}
