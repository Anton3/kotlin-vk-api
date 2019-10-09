@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.docs.objects.SaveDoc
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

/**
 * [https://vk.com/dev/docs.save]
 *
 * Saves a document after [vk.com/dev/upload_files_2|uploading it to a server]
 *
 * @property file This parameter is returned when the file is [vk.com/dev/upload_files_2|uploaded to the server]
 * @property title Document title
 * @property tags Document tags
 * @property returnTags 1 if should return tags, 0 otherwise
 */
data class DocsSave(
    var file: String,
    var title: String? = null,
    var tags: String? = null,
    var returnTags: Int? = null
) : VkMethod<List<SaveDoc>, UserGroupMethod>("docs.save", jacksonTypeRef())
