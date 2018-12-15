package name.alatushkin.vkapi.vktypes.utils

import kotlinx.coroutines.runBlocking
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.generated.groups.methods.GroupsGetById
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi(GroupsGetById(groupId = groupId))
        println(result)
    }
}
