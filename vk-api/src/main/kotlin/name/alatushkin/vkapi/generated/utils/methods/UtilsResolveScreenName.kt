@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.utils.objects.DomainResolved
import name.alatushkin.vkapi.tokens.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.resolveScreenName]
 *
 * Detects a type of object (e.g., user, community, application) and its ID by screen name.
 *
 * @property screenName Screen name of the user, community (e.g., 'apiclub,' 'andrew', or 'rules_of_war'), or application.
 */
data class UtilsResolveScreenName(
    var screenName: String
) : VkMethod<DomainResolved>(
    "utils.resolveScreenName",
    jacksonTypeRef()
), UserGroupServiceMethod
