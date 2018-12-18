package name.alatushkin.vkapi.vktypes.utils

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.generated.groups.methods.GroupsGetById
import name.alatushkin.vkapi.methods.execute.batchUnchecked
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi.batchUnchecked(listOf(GroupsGetById(groupId = groupId)))
        println(result)
    }
}
