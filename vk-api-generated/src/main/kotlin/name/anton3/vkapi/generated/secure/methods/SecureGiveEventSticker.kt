@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.secure.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.secure.objects.GiveEventStickerResponse
import name.anton3.vkapi.method.ServiceMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/secure.giveEventSticker]
 *
 * Opens the game achievement and gives the user a sticker
 *
 * @property userIds No description
 * @property achievementId No description
 */
data class SecureGiveEventSticker(
    var userIds: List<Int>,
    var achievementId: Int
) : VkMethod<List<GiveEventStickerResponse>, ServiceMethod>("secure.giveEventSticker", jacksonTypeRef())
