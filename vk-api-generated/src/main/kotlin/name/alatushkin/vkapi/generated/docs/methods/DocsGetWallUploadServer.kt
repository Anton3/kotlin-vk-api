@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.common.objects.UploadServer
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/docs.getWallUploadServer]
 *
 * Returns the server address for document upload onto a user's or community's wall.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
data class DocsGetWallUploadServer(
    var groupId: Long? = null
) : VkMethod<UploadServer>("docs.getWallUploadServer", jacksonTypeRef()),
    UserGroupMethod
