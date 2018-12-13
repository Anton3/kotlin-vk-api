@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.utils.objects.DomainResolved
import name.alatushkin.api.vk.tokens.UserGroupServiceMethod

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
