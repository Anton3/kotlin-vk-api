package name.anton3.vkapi.method

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import name.anton3.vkapi.vktypes.VkLang

open class VkMethod<T, out R : MethodRequirement>(
    @JsonIgnore val apiMethodName: String,
    @JsonIgnore val responseType: TypeReference<T>
) {
    @JsonIgnore
    private var unsafeParamsStorage: MutableMap<String, Any> = LinkedHashMap(4)

    @JsonAnySetter
    fun unsafeParam(name: String, value: Any?) {
        if (value != null) {
            unsafeParamsStorage[name] = value
        } else {
            unsafeParamsStorage.remove(name)
        }
    }

    @JsonAnyGetter
    fun unsafeParams(): Map<String, Any> = unsafeParamsStorage

    var accessToken: String? = null
    var clientSecret: String? = null
    var v: String? = "5.87"
    var lang: VkLang? = null
    var testMode: Int? = null
}
