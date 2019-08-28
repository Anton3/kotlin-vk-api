@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class CreateSubtype(override val value: Int) : ValueEnum<Int> {
    PLACE_OR_BUSINESS(1),
    COMPANY_OR_WEBSITE(2),
    PERSON_OR_GROUP(3),
    PRODUCT_OR_ART(4)
}
