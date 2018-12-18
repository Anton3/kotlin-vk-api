package name.alatushkin.vkapi.vktypes.utils

import io.ktor.client.HttpClient
import io.ktor.client.engine.apache.Apache
import name.alatushkin.vkapi.client.KtorTransportClient
import name.alatushkin.vkapi.executors.SimpleMethodExecutor
import name.alatushkin.vkapi.json.vkObjectMapper
import name.alatushkin.vkapi.tokens.GroupToken
import name.alatushkin.vkapi.tokens.UserToken
import java.io.FileInputStream
import java.nio.file.Paths
import java.util.*

private fun readConfigParam(name: String): String {
    val testParams: Map<out Any, Any> =
        readPropsFrom("gradle.properties")
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
val groupId = readConfigParam("groupId")
val peerId = readConfigParam("peerId").toLong()

const val timeOut = 95_000
val httpClient = KtorTransportClient(HttpClient(Apache) {
    engine {
        socketTimeout = 95_000
    }
})
val executor = SimpleMethodExecutor(httpClient, vkObjectMapper())
val groupToken = GroupToken(groupAccessToken, groupId.toLong())
val userToken = UserToken(userAccessToken, peerId)
val groupApi = executor.withToken(groupToken)
val userApi = executor.withToken(userToken)
