@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.groups.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.groups.objects.CreateSubtype
import name.alatushkin.api.vk.generated.groups.objects.CreateType
import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/groups.create]
 *
 * Creates a new community.
 *
 * @property title Community title.
 * @property description Community description (ignored for 'type' = 'public').
 * @property type Community type. Possible values: *'group' – group,, *'event' – event,, *'public' – public page
 * @property publicCategory Category ID (for 'type' = 'public' only).
 * @property subtype Public page subtype. Possible values: *'1' – place or small business,, *'2' – company, organization or website,, *'3' – famous person or group of people,, *'4' – product or work of art.
 */
data class GroupsCreate(
    var title: String,
    var description: String? = null,
    var type: CreateType? = null,
    var publicCategory: Long? = null,
    var subtype: CreateSubtype? = null
) : VkMethod<Group>(
    "groups.create",
    jacksonTypeRef()
), UserMethod
