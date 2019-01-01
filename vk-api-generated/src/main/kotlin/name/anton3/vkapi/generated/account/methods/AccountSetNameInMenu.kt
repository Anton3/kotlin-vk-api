@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

/**
 * [https://vk.com/dev/account.setNameInMenu]
 *
 * Sets an application screen name (up to 17 characters), that is shown to the user in the left menu.
 *
 * @property userId User ID.
 * @property name Application screen name.
 */
data class AccountSetNameInMenu(
    var userId: Int,
    var name: String? = null
) : VkMethod<OkResponse>("account.setNameInMenu", jacksonTypeRef()),
    UserMethod
