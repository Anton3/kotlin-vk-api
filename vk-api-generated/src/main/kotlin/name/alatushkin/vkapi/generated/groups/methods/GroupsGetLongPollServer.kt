@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.groups.objects.LongPollServer
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/groups.getLongPollServer]
 *
 * Returns the data needed to query a Long Poll server for events
 *
 * @property groupId Community ID
 */
data class GroupsGetLongPollServer(
    var groupId: Long
) : VkMethod<LongPollServer>("groups.getLongPollServer", jacksonTypeRef()),
    UserGroupMethod
