@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.ads.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.ads.objects.Client
import name.alatushkin.api.vk.tokens.UserMethod

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
