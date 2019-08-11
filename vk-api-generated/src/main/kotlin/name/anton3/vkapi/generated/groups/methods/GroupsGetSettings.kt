@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.GroupSettings
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/groups.getSettings]
 *
 * Returns community settings.
 *
 * @property groupId Community ID.
 */
data class GroupsGetSettings(
    var groupId: Int
) : CheckedMethod<GroupSettings, UserMethod>("groups.getSettings", jacksonTypeRef())
