@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.account.objects.LookupContactsService
import name.alatushkin.vkapi.generated.account.objects.LookupResult
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/account.lookupContacts]
 *
 * Allows to search the VK users using phone numbers, e-mail addresses and user IDs on other services.
 *
 * @property contacts List of contacts separated with commas
 * @property service String identifier of a service which contacts are used for searching. Possible values: , * email, * phone, * twitter, * facebook, * odnoklassniki, * instagram, * google
 * @property mycontact Contact of a current user on a specified service
 * @property returnAll '1' – also return contacts found using this service before, '0' – return only contacts found using 'contacts' field.
 * @property fields Profile fields to return. Possible values: 'nickname, domain, sex, bdate, city, country, timezone, photo_50, photo_100, photo_200_orig, has_mobile, contacts, education, online, relation, last_seen, status, can_write_private_message, can_see_all_posts, can_post, universities'.
 */
data class AccountLookupContacts(
    var contacts: List<String>? = null,
    var service: LookupContactsService,
    var mycontact: String? = null,
    var returnAll: Boolean? = null,
    var fields: List<String>? = null
) : VkMethod<LookupResult>(
    "account.lookupContacts",
    jacksonTypeRef()
), UserMethod
