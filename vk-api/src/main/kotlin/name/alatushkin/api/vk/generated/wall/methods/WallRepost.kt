@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.wall.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.wall.objects.RepostResponse
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/wall.repost]
 *
 * Reposts (copies) an object to a user wall or community wall.
 *
 * @property object ID of the object to be reposted on the wall. Example: "wall66748_3675"
 * @property message Comment to be added along with the reposted object.
 * @property groupId Target community ID when reposting to a community.
 * @property markAsAds 
 */
data class WallRepost(
    var `object`: String,
    var message: String? = null,
    var groupId: Long? = null,
    var markAsAds: Boolean? = null
) : VkMethod<RepostResponse>(
    "wall.repost",
    jacksonTypeRef()
), UserMethod
