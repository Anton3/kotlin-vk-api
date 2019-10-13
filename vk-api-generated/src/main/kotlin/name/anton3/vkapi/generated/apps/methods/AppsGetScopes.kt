@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.apps.objects.GetScopesType
import name.anton3.vkapi.generated.apps.objects.Scope
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/apps.getScopes]
 *
 * Returns scopes for auth
 *
 * @property type No description
 */
data class AppsGetScopes(
    var type: GetScopesType? = null
) : VkMethod<VkList<Scope>, UserMethod>("apps.getScopes", jacksonTypeRef())
