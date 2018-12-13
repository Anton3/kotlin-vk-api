package name.alatushkin.api.vk

import kotlinx.coroutines.runBlocking
import name.alatushkin.api.vk.generated.groups.methods.GroupsGetById
import name.alatushkin.api.vk.tokens.invoke
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi(GroupsGetById(groupId = groupId))
        println(result)
    }
}
