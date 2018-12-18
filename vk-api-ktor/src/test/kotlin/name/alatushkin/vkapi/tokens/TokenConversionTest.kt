package name.alatushkin.vkapi.tokens

import name.alatushkin.vkapi.client.VkClient
import name.alatushkin.vkapi.client.invoke
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.executors.MethodExecutor

class ExampleUserMethod : VkMethod<Int>(TODO(), TODO()), UserMethod
class ExampleServiceMethod : VkMethod<Long>(TODO(), TODO()), ServiceMethod
class ExampleUserGroupMethod : VkMethod<Short>(TODO(), TODO()), UserGroupMethod
class ExampleUserServiceMethod : VkMethod<Char>(TODO(), TODO()), UserServiceMethod
class ExampleUserGroupServiceMethod : VkMethod<Double>(TODO(), TODO()), UserGroupServiceMethod

fun getSomeExecutor(): MethodExecutor = TODO()

fun getUserToken(): UserToken = TODO()
fun getSomeUserToken(): Token<UserMethod> =
    getUserToken()
fun getSomeUserGroupToken(): Token<UserGroupMethod> =
    getSomeUserToken()
fun getSomeUserGroupServiceToken(): Token<UserGroupServiceMethod> =
    getSomeUserGroupToken()

suspend fun example() {
    val executor = getSomeExecutor()

    val token1 = getSomeUserToken()
    val vk1 = VkClient(executor, token1)
    val res11 = vk1(ExampleUserMethod())
//    val res12 = vk1(ExampleServiceMethod())
    val res13 = vk1(ExampleUserGroupMethod())
    val res14 = vk1(ExampleUserServiceMethod())
    val res15 = vk1(ExampleUserGroupServiceMethod())

    val token2 = getSomeUserGroupToken()
    val vk2 = VkClient(executor, token2)
//    val res21 = vk2(ExampleUserMethod())
//    val res22 = vk2(ExampleServiceMethod())
    val res23 = vk2(ExampleUserGroupMethod())
//    val res24 = vk2(ExampleUserServiceMethod())
    val res25 = vk2(ExampleUserGroupServiceMethod())

    val token3 = getSomeUserGroupServiceToken()
    val vk3 = VkClient(executor, token3)
//    val res31 = vk3(ExampleUserMethod())
//    val res32 = vk3(ExampleServiceMethod())
//    val res33 = vk3(ExampleUserGroupMethod())
//    val res34 = vk3(ExampleUserServiceMethod())
    val res35 = vk3(ExampleUserGroupServiceMethod())

    println(listOf(res11, res13, res14, res15, res23, res25, res35))
}
