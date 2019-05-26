package name.anton3.vkapi.methods.execute

import kotlinx.coroutines.runBlocking
import name.anton3.vkapi.generated.groups.methods.GroupsGetById
import name.anton3.vkapi.utils.groupApi
import name.anton3.vkapi.utils.groupId
import org.junit.Test

class SimpleMethodExecutorTest {
    @Test
    fun smokeTest1() = runBlocking {
        val result = groupApi.batch(listOf(GroupsGetById(groupId = groupId.toString())))
        println(result)
    }
}
