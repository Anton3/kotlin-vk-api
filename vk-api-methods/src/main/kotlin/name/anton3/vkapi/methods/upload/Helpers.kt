package name.anton3.vkapi.methods.upload

import com.fasterxml.jackson.module.kotlin.readValue
import name.anton3.vkapi.client.UserClient
import name.anton3.vkapi.client.UserGroupClient
import name.anton3.vkapi.generated.docs.methods.DocsGetMessagesUploadServer
import name.anton3.vkapi.generated.docs.methods.DocsSave
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.docs.objects.GetMessagesUploadServerType
import name.anton3.vkapi.generated.messages.methods.MessagesSetChatPhoto
import name.anton3.vkapi.generated.messages.objects.SetChatPhotoResponse
import name.anton3.vkapi.generated.photos.methods.PhotosGetChatUploadServer
import name.anton3.vkapi.generated.photos.methods.PhotosGetMessagesUploadServer
import name.anton3.vkapi.generated.photos.methods.PhotosSaveMessagesPhoto
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.transport.post

data class UploadPhotoResponse(val server: Int, val hash: String, val photo: String)

suspend fun UserGroupClient.uploadMessagePhoto(peerId: Int, byteArray: ByteArray): Photo {
    val uploadUrl = this(PhotosGetMessagesUploadServer(peerId)).uploadUrl

    val uploadResponseRaw = transportClient.post(uploadUrl) { file("photo", "someName.jpg", byteArray) }
    val uploadResponse: UploadPhotoResponse =
        objectMapper.readValue(uploadResponseRaw.data.toString(Charsets.UTF_8))

    val request = uploadResponse.run { PhotosSaveMessagesPhoto(photo = photo, hash = hash, server = server) }
    return this(request).first()
}

data class UploadDocumentResponse(val file: String)

suspend fun UserGroupClient.uploadMessageDocument(
    peerId: Int,
    fileName: String,
    byteArray: ByteArray,
    tags: List<String> = emptyList()
): Doc {
    val uploadUrl = this(DocsGetMessagesUploadServer(GetMessagesUploadServerType.DOC, peerId)).uploadUrl

    val uploadResponseRaw = transportClient.post(uploadUrl) { file("file", fileName, byteArray) }
    val uploadResponse: UploadDocumentResponse =
        objectMapper.readValue(uploadResponseRaw.data.toString(Charsets.UTF_8))

    val request = DocsSave(file = uploadResponse.file, title = fileName, tags = tags.joinToString(","))
    return this(request).first().body as Doc
}

data class UploadChatPhotoResponse(val response: String)

suspend fun UserClient.uploadChatPhoto(
    chatId: Int,
    fileName: String,
    byteArray: ByteArray
): SetChatPhotoResponse {
    val uploadUrl = this(PhotosGetChatUploadServer(chatId = chatId)).uploadUrl

    val response = transportClient.post(uploadUrl) { file("file", fileName, byteArray) }
    val uploadPhotoResponse: UploadChatPhotoResponse =
        objectMapper.readValue(response.data.toString(Charsets.UTF_8))

    return this(MessagesSetChatPhoto(file = uploadPhotoResponse.response))
}
