@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.newsfeed.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserMethod

/**
 * [https://vk.com/dev/newsfeed.saveList]
 *
 * Creates and edits user newsfeed lists
 *
 * @property listId numeric list identifier (if not sent, will be set automatically).
 * @property title list name.
 * @property sourceIds users and communities identifiers to be added to the list. Community identifiers must be negative numbers.
 * @property noReposts reposts display on and off ('1' is for off).
 */
data class NewsfeedSaveList(
    var listId: Int? = null,
    var title: String,
    var sourceIds: List<Int>? = null,
    var noReposts: Boolean? = null
) : VkMethod<Int>("newsfeed.saveList", jacksonTypeRef()),
    UserMethod
