@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.wall.objects.RepostResponse
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/wall.repost]
 *
 * Reposts (copies) an object to a user wall or community wall.
 *
 * @property object ID of the object to be reposted on the wall. Example: "wall66748_3675"
 * @property message Comment to be added along with the reposted object.
 * @property groupId Target community ID when reposting to a community.
 * @property markAsAds No description
 */
data class WallRepost(
    var `object`: String,
    var message: String? = null,
    var groupId: Int? = null,
    var markAsAds: Boolean? = null
) : VkMethod<RepostResponse, UserMethod>("wall.repost", jacksonTypeRef())
