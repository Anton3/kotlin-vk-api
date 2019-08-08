@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.users.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.generated.users.objects.ReportType
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.vktypes.OkResponse

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
    var userId: Int,
    var type: ReportType,
    var comment: String? = null
) : VkMethod<OkResponse>("users.report", jacksonTypeRef()),
    UserMethod
