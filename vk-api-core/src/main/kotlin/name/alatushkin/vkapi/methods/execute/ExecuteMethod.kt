package name.alatushkin.vkapi.methods.execute

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 *  [https://vk.com/dev/execute]
 *
 *  Call up to 25 methods at once.
 *
 *  @property code
 */
@JsonIgnoreProperties("responseType")
abstract class ExecuteMethod<T>(val code: String, responseType: TypeReference<T>) :
    VkMethod<T>("execute", responseType),
    UserGroupMethod
