package name.anton3.vkapi.utils

import com.fasterxml.jackson.databind.ObjectMapper
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.client.VkClientFactory
import name.anton3.vkapi.client.apacheClientFactory
import name.anton3.vkapi.client.defaultHttpAsyncClient
import name.anton3.vkapi.method.GroupMethod
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.tokens.GroupToken
import name.anton3.vkapi.tokens.UserToken
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.*

private fun readConfigParam(name: String): String {
    val testParams: Map<out Any, Any> = readPropsFrom("gradle.properties")
        ?: readPropsFrom("../gradle.properties")
        ?: System.getenv()

    return testParams[name]?.toString() ?: error("$name not found. provide it via gradle.properties or env")
}

private fun readPropsFrom(strPath: String): Properties? {
    val path = Paths.get(strPath)
    val file = path.toAbsolutePath().toFile()
    if (!file.exists())
        return null

    FileInputStream(file).use { fis ->
        val props = Properties()
        props.load(fis)
        return props
    }
}

class Dummy

fun readResource(path: String): ByteArray =
    Dummy::class.java.classLoader.getResourceAsStream(path)!!.readBytes()

private val groupAccessToken: String = readConfigParam("groupAccessToken")
private val userAccessToken: String = readConfigParam("userAccessToken")
val groupId: Int = readConfigParam("groupId").toInt()
val peerId: Int = readConfigParam("peerId").toInt()
val callbackConfirmationCode: String = readConfigParam("callbackConfirmationCode")

private val clientFactory: VkClientFactory = apacheClientFactory(defaultHttpAsyncClient())  // won't close
val groupApi: VkClient<GroupMethod> = clientFactory.group(GroupToken(groupAccessToken))
val userApi: VkClient<UserMethod> = clientFactory.user(UserToken(userAccessToken))
val objectMapper: ObjectMapper = clientFactory.objectMapper
