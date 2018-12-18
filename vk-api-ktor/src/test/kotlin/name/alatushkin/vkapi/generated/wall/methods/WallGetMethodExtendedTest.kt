package name.alatushkin.vkapi.generated.wall.methods

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.vktypes.utils.userApi
import org.junit.Test

class WallGetMethodExtendedTest {
    @Test
    fun smoke1() = runBlocking {
        val result = userApi(WallGet(domain = "departureMsk"))
        println(result)
    }

    @Test
    fun smoke2() = runBlocking {
        val result = userApi(WallGetExtended(domain = "departureMsk"))
        println(result)
    }
}
