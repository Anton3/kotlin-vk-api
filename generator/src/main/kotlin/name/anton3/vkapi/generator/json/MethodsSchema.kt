package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import name.anton3.vkapi.generator.nameMethod
import name.anton3.vkapi.generator.source.JsonTypeRef

data class MethodsSchema(
    val errors: MutableList<Error>,
    val methods: MutableList<MethodSchema>
)

data class Error(
    val name: String,
    val code: Int,
    val description: String
)

data class MethodSchema(
    val name: String,
    val className: String = nameMethod(name, basePackage = "").name,
    val description: String? = null,
    @JsonProperty("access_token_type")
    val accessTokenType: List<String> = emptyList(),
    val parameters: List<MethodParameter> = emptyList(),
    val responses: MethodResponses,
    val errors: List<Error>? = null,

    @JsonIgnore
    val fixedParams: Map<String, String?> = HashMap()
) {
    fun normalize(postfix: String, fixedVariables: Map<String, String?>, responseRef: SchemaFileRef): MethodSchema {
        return this.copy(
            className = className + postfix,
            parameters = parameters.filter { it.name !in fixedVariables },
            fixedParams = fixedParams + fixedVariables,
            responses = BasicMethodResponses(responseRef)
        )
    }

    val normalizedResponse: SchemaFileRef
        get() = (responses as BasicMethodResponses).response
}


data class SchemaFileRef(val `$ref`: String) {
    fun toJsonRef(): JsonTypeRef {
        return this.`$ref`.substringAfterLast('/')
    }
}
