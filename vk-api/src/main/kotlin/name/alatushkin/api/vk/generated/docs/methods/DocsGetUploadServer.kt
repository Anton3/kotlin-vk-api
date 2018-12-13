@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.common.objects.UploadServer
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.getUploadServer]
 *
 * Returns the server address for document upload.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
data class DocsGetUploadServer(
    var groupId: Long? = null
) : VkMethod<UploadServer>(
    "docs.getUploadServer",
    jacksonTypeRef()
), UserMethod
