package name.alatushkin.vkapi.core

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.vkapi.json.ForwardableAttributes
import name.alatushkin.vkapi.vktypes.VkLang

open class VkMethod<T>(
    @JsonIgnore val apiMethodName: String,
    @JsonIgnore val responseType: TypeReference<T>
) {
    @JsonIgnore
    val unsafeParams: MutableMap<String, String> = mutableMapOf()

    // Format of `name`: lower underscore
    fun unsafeParam(name: String, value: String?) {
        if (value != null) {
            unsafeParams[name] = value
        } else {
            unsafeParams.remove(name)
        }
    }

    var accessToken: String? = null
    var clientSecret: String? = null
    var v: String? = "5.87"
    var lang: VkLang? = null
    var testMode: Int? = null

    open val parserAttributes: ForwardableAttributes
        @JsonIgnore get() = ForwardableAttributes.EMPTY
}
