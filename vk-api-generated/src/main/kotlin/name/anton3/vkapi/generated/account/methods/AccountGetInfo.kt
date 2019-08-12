@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.account.objects.Info
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/account.getInfo]
 *
 * Returns current account info.
 *
 * @property fields Fields to return. Possible values: *'country' — user country,, *'https_required' — is "HTTPS only" option enabled,, *'own_posts_default' — is "Show my posts only" option is enabled,, *'no_wall_replies' — are wall replies disabled or not,, *'intro' — is intro passed by user or not,, *'lang' — user language. By default: all.
 */
data class AccountGetInfo(
    var fields: List<String>? = null
) : VkMethod<Info, UserMethod>("account.getInfo", jacksonTypeRef())
