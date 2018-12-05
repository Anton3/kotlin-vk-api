@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.leads.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess
import name.alatushkin.api.vk.generated.leads.Entry
import name.alatushkin.api.vk.generated.leads.GetUsersStatus
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
class LeadsGetUsersMethod(
        offerId: Long,
        secret: String,
        offset: Long? = null,
        count: Long? = null,
        status: GetUsersStatus? = null,
        reverse: Boolean? = null
) : VkMethod<Array<Entry>>(
    "leads.getUsers",
    mutableMapOf(),
    object : TypeReference<VkSuccess<Array<Entry>>>() {}
), UserServiceMethod {

    var offerId: Long by props
    var secret: String by props
    var offset: Long? by props
    var count: Long? by props
    var status: GetUsersStatus? by props
    var reverse: Boolean? by props

    init {
        this.offerId = offerId
        this.secret = secret
        this.offset = offset
        this.count = count
        this.status = status
        this.reverse = reverse
    }

    fun setOfferId(offerId: Long): LeadsGetUsersMethod {
        this.offerId = offerId
        return this
    }

    fun setSecret(secret: String): LeadsGetUsersMethod {
        this.secret = secret
        return this
    }

    fun setOffset(offset: Long): LeadsGetUsersMethod {
        this.offset = offset
        return this
    }

    fun setCount(count: Long): LeadsGetUsersMethod {
        this.count = count
        return this
    }

    fun setStatus(status: GetUsersStatus): LeadsGetUsersMethod {
        this.status = status
        return this
    }

    fun setReverse(reverse: Boolean): LeadsGetUsersMethod {
        this.reverse = reverse
        return this
    }
}
