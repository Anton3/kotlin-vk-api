package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.annotation.JsonIgnore
import name.anton3.vkapi.generator.nameMethod
import name.anton3.vkapi.generator.source.JsonTypeRef

val RefType.ref: JsonTypeRef
    @JsonIgnore get() = `$ref`.substringAfterLast('/')

val SimpleType.ref: JsonTypeRef
    @JsonIgnore get() = type.value

val ObjectType.response: TypeSchema
    @JsonIgnore get() = this.properties["response"] ?: error("This object is not a response")


data class NormalizedMethod(
    val name: String,
    val description: String?,
    val accessTokenType: List<AccessTokenType>,
    val parameters: List<MethodParameterSchema>,
    val errors: List<Error>,
    val className: String,
    val fixedParams: Map<String, String?>,
    val response: JsonTypeRef
)

fun MethodSchema.normalize(
    postfix: String,
    fixedVariables: Map<String, String?>,
    responseRef: RefType
): NormalizedMethod {
    return NormalizedMethod(
        name = name,
        description = description,
        accessTokenType = accessTokenType,
        parameters = parameters.filter { it.name !in fixedVariables },
        errors = errors,
        className = nameMethod(name, basePackage = "").name + postfix,
        fixedParams = fixedVariables,
        response = responseRef.ref
    )
}

fun MethodSchema.normalize(): List<NormalizedMethod> =
    responses.normalizeMethodDefinition(this)
