@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.apps.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/apps.getScore]
 *
 * Returns user score in app
 *
 * @property userId No description
 */
data class AppsGetScore(
    var userId: Int
) : CheckedMethod<Int, UserMethod>("apps.getScore", jacksonTypeRef())
