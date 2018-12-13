package name.alatushkin.api.vk.execute

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 methods at once.
 *
 *  @property code
 */
abstract class ExecuteMethod<T>(val code: String, responseType: TypeReference<T>) :
    VkMethod<T>("execute", responseType), UserGroupMethod
