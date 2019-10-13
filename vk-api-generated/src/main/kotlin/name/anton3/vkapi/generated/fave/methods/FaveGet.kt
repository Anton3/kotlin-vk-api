@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.fave.objects.Bookmark
import name.anton3.vkapi.generated.fave.objects.ItemType
import name.anton3.vkapi.generated.users.objects.Fields
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.get]
 *
 * No description
 *
 * @property itemType No description
 * @property tagId Tag ID.
 * @property offset Offset needed to return a specific subset of users.
 * @property count Number of users to return.
 * @property fields No description
 * @property isFromSnackbar No description
 */
data class FaveGet(
    var itemType: ItemType? = null,
    var tagId: Int? = null,
    var offset: Int? = null,
    var count: Int? = null,
    var fields: List<Fields>? = null,
    var isFromSnackbar: Boolean? = null
) : VkMethod<VkList<Bookmark>, UserMethod>("fave.get", jacksonTypeRef())
