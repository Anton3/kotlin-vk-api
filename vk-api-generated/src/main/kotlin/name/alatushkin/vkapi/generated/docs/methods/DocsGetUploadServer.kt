@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getUploadServer]
 *
 * Returns the server address for document upload.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
data class DocsGetUploadServer(
    var groupId: Long? = null
) : VkMethod<UploadServer>("docs.getUploadServer", jacksonTypeRef()),
    UserMethod
