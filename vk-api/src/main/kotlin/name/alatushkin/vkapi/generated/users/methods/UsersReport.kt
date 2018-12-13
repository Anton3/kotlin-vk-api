@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.OkResponse
import name.alatushkin.vkapi.generated.users.objects.ReportType
import name.alatushkin.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/users.report]
 *
 * Reports (submits a complain about) a user.
 *
 * @property userId ID of the user about whom a complaint is being made.
 * @property type Type of complaint: 'porn' – pornography, 'spam' – spamming, 'insult' – abusive behavior, 'advertisment' – disruptive advertisements
 * @property comment Comment describing the complaint.
 */
data class UsersReport(
    var userId: Long,
    var type: ReportType,
    var comment: String? = null
) : VkMethod<OkResponse>(
    "users.report",
    jacksonTypeRef()
), UserMethod
