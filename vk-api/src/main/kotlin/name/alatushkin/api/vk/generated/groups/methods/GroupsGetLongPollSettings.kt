@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.LongPollSettings
import name.alatushkin.api.vk.tokens.UserGroupMethod

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
