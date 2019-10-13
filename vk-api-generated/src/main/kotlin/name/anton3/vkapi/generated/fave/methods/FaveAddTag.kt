@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.fave.objects.Tag
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/fave.addTag]
 *
 * No description
 *
 * @property name No description
 */
data class FaveAddTag(
    var name: String? = null
) : VkMethod<Tag, UserMethod>("fave.addTag", jacksonTypeRef())
