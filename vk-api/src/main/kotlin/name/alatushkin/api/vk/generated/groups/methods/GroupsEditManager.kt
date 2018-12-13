@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.OkResponse
import name.alatushkin.api.vk.generated.groups.objects.EditManagerRole
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.editManager]
 *
 * Allows to add, remove or edit the community manager.
 *
 * @property groupId Community ID.
 * @property userId User ID.
 * @property role Manager role. Possible values: *'moderator',, *'editor',, *'administrator'.
 * @property isContact '1' — to show the manager in Contacts block of the community.
 * @property contactPosition Position to show in Contacts block.
 * @property contactPhone Contact phone.
 * @property contactEmail Contact e-mail.
 */
data class GroupsEditManager(
    var groupId: Long,
    var userId: Long,
    var role: EditManagerRole? = null,
    var isContact: Boolean? = null,
    var contactPosition: String? = null,
    var contactPhone: String? = null,
    var contactEmail: String? = null
) : VkMethod<OkResponse>(
    "groups.editManager",
    jacksonTypeRef()
), UserMethod
