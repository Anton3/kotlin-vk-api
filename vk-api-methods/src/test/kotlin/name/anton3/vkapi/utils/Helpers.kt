package name.anton3.vkapi.utils

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import name.anton3.vkapi.client.GroupClient
import name.anton3.vkapi.client.KtorTransportClient
import name.anton3.vkapi.client.UserClient
import name.anton3.vkapi.client.VkClient
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.TransportClient
import name.anton3.vkapi.executors.JsonApiMethodExecutor
import name.anton3.vkapi.executors.TokenMethodExecutor
import name.anton3.vkapi.json.core.vkObjectMapper
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

val groupAccessToken: String = readConfigParam("groupAccessToken")
val userAccessToken: String = readConfigParam("userAccessToken")
val groupId: Int = readConfigParam("groupId").toInt()
val peerId: Int = readConfigParam("peerId").toInt()

const val longPollTimeout: Int = 8
val httpClient: TransportClient = KtorTransportClient(HttpClient(Apache) {
    engine {
        socketTimeout = 10_000
    }
})
val executor: MethodExecutor = JsonApiMethodExecutor(httpClient, vkObjectMapper())
val groupApi: VkClient<GroupMethod> = GroupClient(TokenMethodExecutor(executor, GroupToken(groupAccessToken)))
val userApi: VkClient<UserMethod> = UserClient(TokenMethodExecutor(executor, UserToken(userAccessToken)))
