@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.prettyCards.objects.CreateResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/prettyCards.create]
 *
 * No description
 *
 * @property ownerId No description
 * @property photo No description
 * @property title No description
 * @property link No description
 * @property price No description
 * @property priceOld No description
 * @property button No description
 */
data class PrettyCardsCreate(
    var ownerId: Int,
    var photo: String,
    var title: String,
    var link: String,
    var price: String? = null,
    var priceOld: String? = null,
    var button: String? = null
) : VkMethod<CreateResponse, UserMethod>("prettyCards.create", jacksonTypeRef())
