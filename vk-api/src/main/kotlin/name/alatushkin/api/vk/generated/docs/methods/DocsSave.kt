@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.docs.objects.Doc
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.save]
 *
 * Saves a document after [vk.com/dev/upload_files_2|uploading it to a server].
 *
 * @property file This parameter is returned when the file is [vk.com/dev/upload_files_2|uploaded to the server].
 * @property title Document title.
 * @property tags Document tags.
 */
data class DocsSave(
    var file: String,
    var title: String? = null,
    var tags: String? = null
) : VkMethod<List<Doc>>(
    "docs.save",
    jacksonTypeRef()
), UserGroupMethod
