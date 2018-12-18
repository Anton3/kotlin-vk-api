package name.anton3.vkapi.vktypes.utils

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.groups.methods.GroupsGetById
import name.anton3.vkapi.methods.execute.batchUnchecked
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi.batchUnchecked(listOf(GroupsGetById(groupId = groupId)))
        println(result)
    }
}
