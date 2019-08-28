@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class DocType(override val value: Int) : ValueEnum<Int> {
    TEXT(1),
    ARCH(2),
    GIF(3),
    IMAGE(4),
    AUDIO(5),
    VIDEO(6),
    EBOOK(7),
    UNKNOWN(8)
}
