@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.leads.objects.Entry
import name.alatushkin.api.vk.generated.leads.objects.GetUsersStatus
import name.alatushkin.api.vk.tokens.UserServiceMethod

/**
 * [https://vk.com/dev/leads.getUsers]
 *
 * Returns a list of last user actions for the offer.
 *
 * @property offerId Offer ID.
 * @property secret Secret key obtained in the lead testing interface.
 * @property offset Offset needed to return a specific subset of results.
 * @property count Number of results to return.
 * @property status Action type. Possible values: *'0' — start,, *'1' — finish,, *'2' — blocking users,, *'3' — start in a test mode,, *'4' — finish in a test mode.
 * @property reverse Sort order. Possible values: *'1' — chronological,, *'0' — reverse chronological.
 */
data class LeadsGetUsers(
    var offerId: Long,
    var secret: String,
    var offset: Long? = null,
    var count: Long? = null,
    var status: GetUsersStatus? = null,
    var reverse: Boolean? = null
) : VkMethod<List<Entry>>(
    "leads.getUsers",
    jacksonTypeRef()
), UserServiceMethod
