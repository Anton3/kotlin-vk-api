package name.anton3.vkapi.methods.execute

import com.fasterxml.jackson.core.type.TypeReference
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 methods at once.
 *
 *  @property code
 */
abstract class ExecuteMethod<T>(val code: String, responseType: TypeReference<T>) :
    VkMethod<T>("execute", responseType),
    UserGroupMethod
