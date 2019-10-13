@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class RelativeType(override val value: String) : ValueEnum<String> {
    PARENT("parent"),
    CHILD("child"),
    GRANDPARENT("grandparent"),
    GRANDCHILD("grandchild"),
    SIBLING("sibling")
}
