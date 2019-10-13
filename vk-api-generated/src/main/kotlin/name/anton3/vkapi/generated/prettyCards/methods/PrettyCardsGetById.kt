@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.prettyCards.objects.PrettyCard
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/prettyCards.getById]
 *
 * No description
 *
 * @property ownerId No description
 * @property cardIds No description
 */
data class PrettyCardsGetById(
    var ownerId: Int,
    var cardIds: List<Int>
) : VkMethod<List<PrettyCard>, UserMethod>("prettyCards.getById", jacksonTypeRef())
