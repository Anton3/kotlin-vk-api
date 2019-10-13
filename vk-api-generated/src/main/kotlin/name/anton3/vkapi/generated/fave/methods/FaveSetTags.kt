@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.fave.objects.ItemType
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/fave.setTags]
 *
 * No description
 *
 * @property itemType No description
 * @property itemOwnerId No description
 * @property itemId No description
 * @property tagIds No description
 * @property linkId No description
 * @property linkUrl No description
 */
data class FaveSetTags(
    var itemType: ItemType? = null,
    var itemOwnerId: Int? = null,
    var itemId: Int? = null,
    var tagIds: List<Int>? = null,
    var linkId: String? = null,
    var linkUrl: String? = null
) : VkMethod<OkResponse, UserMethod>("fave.setTags", jacksonTypeRef())
