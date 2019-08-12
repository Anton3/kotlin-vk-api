package name.anton3.vkapi.methods.execute

import com.fasterxml.jackson.core.type.TypeReference
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.method.UserGroupMethod

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 methods at once.
 *
 *  @property code
 */
abstract class ExecuteMethod<T>(val code: String, responseType: TypeReference<T>) :
    VkMethod<T, UserGroupMethod>("execute", responseType)
