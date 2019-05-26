package name.anton3.vkapi.tokens

import name.anton3.vkapi.client.UserClient
import name.anton3.vkapi.client.UserGroupClient
import name.anton3.vkapi.client.UserGroupServiceClient
import name.anton3.vkapi.core.MethodExecutor
import name.anton3.vkapi.core.VkMethod

private val error: Nothing get() = error("")

class ExampleUserMethod : VkMethod<Int>(error, error), UserMethod
class ExampleServiceMethod : VkMethod<Long>(error, error), ServiceMethod
class ExampleUserGroupMethod : VkMethod<Short>(error, error), UserGroupMethod
class ExampleUserServiceMethod : VkMethod<Char>(error, error), UserServiceMethod
class ExampleUserGroupServiceMethod : VkMethod<Double>(error, error), UserGroupServiceMethod

fun getSomeExecutor(): MethodExecutor = error

suspend fun example() {
    val executor = getSomeExecutor()

    val vk1 = UserClient(executor)
    val res11 = vk1(ExampleUserMethod())
//    val res12 = vk1(ExampleServiceMethod())
    val res13 = vk1(ExampleUserGroupMethod())
    val res14 = vk1(ExampleUserServiceMethod())
    val res15 = vk1(ExampleUserGroupServiceMethod())

    val vk2 = UserGroupClient(executor)
//    val res21 = vk2(ExampleUserMethod())
//    val res22 = vk2(ExampleServiceMethod())
    val res23 = vk2(ExampleUserGroupMethod())
//    val res24 = vk2(ExampleUserServiceMethod())
    val res25 = vk2(ExampleUserGroupServiceMethod())

    val vk3 = UserGroupServiceClient(executor)
//    val res31 = vk3(ExampleUserMethod())
//    val res32 = vk3(ExampleServiceMethod())
//    val res33 = vk3(ExampleUserGroupMethod())
//    val res34 = vk3(ExampleUserServiceMethod())
    val res35 = vk3(ExampleUserGroupServiceMethod())

    println(listOf(res11, res13, res14, res15, res23, res25, res35))
}
