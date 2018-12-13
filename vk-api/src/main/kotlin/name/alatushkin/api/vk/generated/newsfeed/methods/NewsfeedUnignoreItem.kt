@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.newsfeed.objects.UnignoreItemType
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/newsfeed.unignoreItem]
 *
 * Returns a hidden item to the newsfeed.
 *
 * @property type Item type. Possible values: *'wall' – post on the wall,, *'tag' – tag on a photo,, *'profilephoto' – profile photo,, *'video' – video,, *'audio' – audio.
 * @property ownerId Item owner's identifier (user or community), "Note that community id must be negative. 'owner_id=1' – user , 'owner_id=-1' – community "
 * @property itemId Item identifier
 */
data class NewsfeedUnignoreItem(
    var type: UnignoreItemType,
    var ownerId: Long,
    var itemId: Long
) : VkMethod<OkResponse>(
    "newsfeed.unignoreItem",
    jacksonTypeRef()
), UserMethod
