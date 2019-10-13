@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.prettyCards.objects.PrettyCard
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/prettyCards.get]
 *
 * No description
 *
 * @property ownerId No description
 * @property offset No description
 * @property count No description
 */
data class PrettyCardsGet(
    var ownerId: Int,
    var offset: Int? = null,
    var count: Int? = null
) : VkMethod<VkList<PrettyCard>, UserMethod>("prettyCards.get", jacksonTypeRef())
