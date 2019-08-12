@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.groups.objects.LongPollServer
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/groups.getLongPollServer]
 *
 * Returns the data needed to query a Long Poll server for events
 *
 * @property groupId Community ID
 */
data class GroupsGetLongPollServer(
    var groupId: Int
) : VkMethod<LongPollServer, UserGroupMethod>("groups.getLongPollServer", jacksonTypeRef())
