package name.anton3.vkapi.utils

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import name.anton3.vkapi.client.KtorTransportClient
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.executors.SimpleMethodExecutor
import name.anton3.vkapi.json.vkObjectMapper
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

fun readResource(path: String): ByteArray =
        String::class.java.classLoader.getResourceAsStream(path).readBytes()

val groupAccessToken = readConfigParam("groupAccessToken")
val userAccessToken = readConfigParam("userAccessToken")
val groupId = readConfigParam("groupId").toLong()
val peerId = readConfigParam("peerId").toLong()

const val timeout = 9
val httpClient = KtorTransportClient(HttpClient(Apache) {
    engine {
        socketTimeout = 10_000
    }
})
val executor = SimpleMethodExecutor(httpClient, vkObjectMapper())
val groupToken = GroupToken(groupAccessToken, groupId)
val userToken = UserToken(userAccessToken, groupId)
val groupApi = VkClient(executor, groupToken)
val userApi = VkClient(executor, userToken)
