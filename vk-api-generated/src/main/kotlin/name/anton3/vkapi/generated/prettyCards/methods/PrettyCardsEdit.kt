@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.prettyCards.objects.EditResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/prettyCards.edit]
 *
 * No description
 *
 * @property ownerId No description
 * @property cardId No description
 * @property photo No description
 * @property title No description
 * @property link No description
 * @property price No description
 * @property priceOld No description
 * @property button No description
 */
data class PrettyCardsEdit(
    var ownerId: Int,
    var cardId: Int,
    var photo: String? = null,
    var title: String? = null,
    var link: String? = null,
    var price: String? = null,
    var priceOld: String? = null,
    var button: String? = null
) : VkMethod<EditResponse, UserMethod>("prettyCards.edit", jacksonTypeRef())
