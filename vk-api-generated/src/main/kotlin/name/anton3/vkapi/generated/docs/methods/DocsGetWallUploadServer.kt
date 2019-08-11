@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.docs.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UploadServer
import name.anton3.vkapi.method.CheckedMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 * [https://vk.com/dev/docs.getWallUploadServer]
 *
 * Returns the server address for document upload onto a user's or community's wall.
 *
 * @property groupId Community ID (if the document will be uploaded to the community).
 */
data class DocsGetWallUploadServer(
    var groupId: Int? = null
) : CheckedMethod<UploadServer, UserGroupMethod>("docs.getWallUploadServer", jacksonTypeRef())
