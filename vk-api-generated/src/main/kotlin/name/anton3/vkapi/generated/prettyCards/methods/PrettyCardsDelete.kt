@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.prettyCards.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.prettyCards.objects.DeleteResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/prettyCards.delete]
 *
 * No description
 *
 * @property ownerId No description
 * @property cardId No description
 */
data class PrettyCardsDelete(
    var ownerId: Int,
    var cardId: Int
) : VkMethod<DeleteResponse, UserMethod>("prettyCards.delete", jacksonTypeRef())
