package name.anton3.vkapi.methods.execute

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.wall.methods.WallGet
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.userApi
import name.anton3.vkapi.vktypes.VkApiException
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class ExecuteManyMethodsTest {
    @Test
    fun smokeSuccess1() = runBlocking {
        val methods = (0..24).map { page: Int ->
            WallGet(
                domain = "departureMsk",
                offset = page,
                count = 100
            )
        }

        val result = userApi.batch(methods)
        println(result.joinToString("\n"))
        assertEquals(result.size, 25)
    }

    @Test
    fun smokeError1() = runBlocking {
        val methods = (0..24).map { page: Int ->
            WallGet(
                domain = "departureMsk",
                offset = page,
                count = 100
            )
        }

        val result = groupApi.unchecked.batch(methods)
        println(result.joinToString("\n"))
        assertEquals(result.size, 25)
    }

    @Test
    fun smokeError2() = runBlocking {
        try {
            groupApi.unchecked(
                WallGet(
                    domain = "departureMsk",
                    offset = 0,
                    count = 100
                )
            )
            fail("must throw exception")
        } catch (e: VkApiException) {
            val vkError = e.vkError
            println(vkError)
        }
    }
}
