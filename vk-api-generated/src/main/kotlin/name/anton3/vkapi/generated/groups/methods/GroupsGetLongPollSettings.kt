@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.LongPollSettings
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getLongPollSettings]
 *
 * Returns Long Poll notification settings
 *
 * @property groupId Community ID.
 */
data class GroupsGetLongPollSettings(
    var groupId: Int
) : CheckedMethod<LongPollSettings, UserGroupMethod>("groups.getLongPollSettings", jacksonTypeRef())
