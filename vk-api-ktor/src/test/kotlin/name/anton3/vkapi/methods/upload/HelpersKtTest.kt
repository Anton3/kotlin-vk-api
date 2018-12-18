package name.anton3.vkapi.methods.upload

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.vktypes.toAttachmentId
import name.anton3.vkapi.vktypes.utils.groupApi
import name.anton3.vkapi.vktypes.utils.readResource
import org.junit.Test

class HelpersKtTest {
    @Test
    fun uploadPhotoToMessagesTest1() = runBlocking {
        val testPicture = readResource("testPicture.jpg")
        val result = groupApi.uploadMessagePhoto(5518788, testPicture)
        println(result.toAttachmentId())
    }

    @Test
    fun uploadDocToMessagesTest1() = runBlocking {
        val testPicture = readResource("testPicture.jpg")
        val result = groupApi.uploadMessageDocument(5518788, "testPicture.jpg", testPicture)
        println(result.toAttachmentId())
    }
}
