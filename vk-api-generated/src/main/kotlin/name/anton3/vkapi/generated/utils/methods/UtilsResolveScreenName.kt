@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.utils.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.utils.objects.DomainResolved
import name.anton3.vkapi.method.UserGroupServiceMethod

/**
 * [https://vk.com/dev/utils.resolveScreenName]
 *
 * Detects a type of object (e.g., user, community, application) and its ID by screen name.
 *
 * @property screenName Screen name of the user, community (e.g., 'apiclub,' 'andrew', or 'rules_of_war'), or application.
 */
data class UtilsResolveScreenName(
    var screenName: String
) : VkMethod<DomainResolved>("utils.resolveScreenName", jacksonTypeRef()),
    UserGroupServiceMethod
