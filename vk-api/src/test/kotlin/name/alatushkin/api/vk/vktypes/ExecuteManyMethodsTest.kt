package name.alatushkin.api.vk.vktypes

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.core.VkResult
import name.alatushkin.api.vk.execute.batch
import name.alatushkin.api.vk.execute.batchUnchecked
import name.alatushkin.api.vk.generated.wall.methods.WallGet
import name.alatushkin.api.vk.generated.wall.objects.WallpostFull
import name.alatushkin.api.vk.groupApi
import name.alatushkin.api.vk.userApi
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test

class ExecuteManyMethodsTest {
    @Test
    fun smokeSuccess1() = runBlocking {
        val methods = (0..24L).map { page: Long ->
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
        val methods = (0..24L).map { page: Long ->
            WallGet(
                domain = "departureMsk",
                offset = page,
                count = 100
            )
        }

        val rawResult = groupApi.batchUnchecked(methods)

        @Suppress("UNCHECKED_CAST")
        val result = rawResult as List<VkResult<VkList<WallpostFull>>>

        println(result.joinToString("\n"))
        assertEquals(result.size, 25)
    }

    @Test
    fun smokeError2() = runBlocking {
        try {
            groupApi.executeUnchecked(
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
