@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.ads.objects.Client
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/ads.getClients]
 *
 * Returns a list of advertising agency's clients.
 *
 * @property accountId Advertising account ID.
 */
data class AdsGetClients(
    var accountId: Long
) : VkMethod<List<Client>>(
    "ads.getClients",
    jacksonTypeRef()
), UserMethod
