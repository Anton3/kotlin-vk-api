package name.anton3.vkapi.methods.upload

import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.client.invoke
import name.anton3.vkapi.core.RequestContent
import name.anton3.vkapi.core.post
import name.anton3.vkapi.generated.docs.methods.DocsGetMessagesUploadServer
import name.anton3.vkapi.generated.docs.methods.DocsSave
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.docs.objects.GetMessagesUploadServerType
import name.anton3.vkapi.generated.photos.methods.PhotosGetMessagesUploadServer
import name.anton3.vkapi.generated.photos.methods.PhotosSaveMessagesPhoto
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.tokens.UserGroupMethod
import java.nio.charset.Charset

data class UploadPhotoResponse(val server: Long, val hash: String, val photo: String)

suspend fun VkClient<UserGroupMethod>.uploadMessagePhoto(peerId: Long, byteArray: ByteArray): Photo {
    val uploadUrl = this(PhotosGetMessagesUploadServer(peerId)).uploadUrl
    val response = httpClient.post(uploadUrl, RequestContent.File("photo", "someName.jpg", byteArray))

    val uploadPhotoResponse: UploadPhotoResponse =
        objectMapper.readValue(response.data.toString(Charset.forName("UTF-8")))

    return this(
        PhotosSaveMessagesPhoto(
            photo = uploadPhotoResponse.photo,
            hash = uploadPhotoResponse.hash,
            server = uploadPhotoResponse.server
        )
    ).first()
}

data class UploadDocumentResponse(val file: String)

suspend fun VkClient<UserGroupMethod>.uploadMessageDocument(
    peerId: Long,
    fileName: String,
    byteArray: ByteArray,
    tags: List<String> = emptyList()
): Doc {
    val uploadUrl = this(DocsGetMessagesUploadServer(GetMessagesUploadServerType.DOC, peerId)).uploadUrl

    val response = httpClient.post(uploadUrl, RequestContent.File("file", fileName, byteArray))
    val uploadDocumentResponse: UploadDocumentResponse =
        objectMapper.readValue(response.data.toString(Charset.forName("UTF-8")))

    return this(
        DocsSave(
            file = uploadDocumentResponse.file,
            title = fileName,
            tags = tags.joinToString(",")
        )
    ).first()
}
