@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.LongPollSettings
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getLongPollSettings]
 *
 * Returns Long Poll notification settings
 *
 * @property groupId Community ID.
 */
data class GroupsGetLongPollSettings(
    var groupId: Long
) : VkMethod<LongPollSettings>(
    "groups.getLongPollSettings",
    jacksonTypeRef()
), UserGroupMethod
