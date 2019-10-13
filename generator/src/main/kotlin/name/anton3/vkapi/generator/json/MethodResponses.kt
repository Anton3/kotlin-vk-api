package name.anton3.vkapi.generator.json

import com.fasterxml.jackson.databind.JsonDeserializer
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generator.under2Camel

/**
Распределение типов возвращаемых значений по типам
просто реализуем расширение списка методов
(MethodResponses, 384)
(MethodExtendedResponses, 36)
(FieldsResponses, 3)
(OnlineMobileResponse, 1)
(TargetUidsResponse, 1)
(NeedMutualResponse, 1)
(UserIdsResponse, 1)
(MethodFieldWithFilterResponses, 1)
(SuggestMethodResponses, 1)
 */

@JsonDeserialize(using = MethodResponsesDeserializer::class)
interface MethodResponses {
    fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod>
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class BasicMethodResponses(val response: RefType) : MethodResponses {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(methodSchema.normalize("", emptyMap(), response))
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
open class MethodExtendedResponses(
    val response: RefType,
    val extendedResponse: RefType
) : MethodResponses {

    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("extended" to null), response),
            methodSchema.normalize("Extended", mapOf("extended" to "1"), extendedResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
open class FieldsResponses(
    val response: RefType,
    val fieldsResponse: RefType
) : MethodResponses {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("fields" to null), response),
            methodSchema.normalize("WithFields", emptyMap(), fieldsResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class MethodFieldWithFilterResponses(
    response: RefType,
    fieldsResponse: RefType,
    val filterResponse: RefType
) : FieldsResponses(response, fieldsResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("fields" to null), response),
            methodSchema.normalize("WithFields", emptyMap(), fieldsResponse),
            methodSchema.normalize("Managers", mapOf("fields" to null, "filter" to "managers"), filterResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class OnlineMobileResponse(
    val response: RefType,
    val onlineMobileResponse: RefType
) : MethodResponses {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("online_mobile" to null), response),
            methodSchema.normalize("OnlineMobile", mapOf("online_mobile" to "1"), onlineMobileResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class TargetUidsResponse(
    val response: RefType,
    val targetUidsResponse: RefType
) : MethodResponses {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("target_uids" to null), response),
            methodSchema.normalize("ManyUIds", emptyMap(), targetUidsResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class NeedMutualResponse(
    response: RefType,
    extendedResponse: RefType,
    val needMutualResponse: RefType
) : MethodExtendedResponses(response, extendedResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("extended" to null, "need_mutual" to null), response),
            methodSchema.normalize("NeedMutual", mapOf("extended" to null, "need_mutual" to "1"), needMutualResponse),
            methodSchema.normalize("Extended", mapOf("extended" to "1", "need_mutual" to "1"), extendedResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
class UserIdsResponse(
    response: RefType,
    extendedResponse: RefType,
    val userIdsResponse: RefType? = null,
    val userIdsExtendedResponse: RefType? = null
) : MethodExtendedResponses(response, extendedResponse) {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        return listOf(
            methodSchema.normalize("", mapOf("extended" to null, "user_ids" to null), response),
            methodSchema.normalize("Extended", mapOf("extended" to "1", "user_ids" to null), extendedResponse),
            methodSchema.normalize("UserIds", mapOf("extended" to null, "user_id" to null), response),
            methodSchema.normalize("UserIdsExtended", mapOf("extended" to "1", "user_id" to null), extendedResponse)
        )
    }
}

@JsonDeserialize(using = JsonDeserializer.None::class)
open class SuggestMethodResponses(
    val response: RefType,
    val regionsResponse: RefType,
    val citiesResponse: RefType,
    val schoolsResponse: RefType
) : MethodResponses {
    override fun normalizeMethodDefinition(methodSchema: MethodSchema): List<NormalizedMethod> {
        val result = mutableListOf<NormalizedMethod>()

        listOf(
            "countries",
            "positions",
            "interest_categories",
            "religions",
            "user_devices",
            "user_os",
            "user_browsers"
        ).forEach {
            result += methodSchema.normalize(
                under2Camel(it),
                mapOf("section" to it, "ids" to null, "country" to null, "cities" to null),
                response
            )
            result += methodSchema.normalize(
                "Decode" + under2Camel(it),
                mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                response
            )
        }

        listOf("regions").forEach {
            result += methodSchema.normalize(
                under2Camel(it),
                mapOf("section" to it, "ids" to null, "cities" to null),
                regionsResponse
            )
            result += methodSchema.normalize(
                "Decode" + under2Camel(it),
                mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                regionsResponse
            )
        }

        listOf("cities", "districts", "streets").forEach {
            result += methodSchema.normalize(
                "Decode" + under2Camel(it),
                mapOf("section" to it, "q" to null, "country" to null, "cities" to null),
                citiesResponse
            )
        }

        result += methodSchema.normalize(
            "Cities",
            mapOf("section" to "cities", "ids" to null, "cities" to null),
            citiesResponse
        )
        result += methodSchema.normalize(
            "Districts",
            mapOf("section" to "districts", "ids" to null, "country" to null),
            citiesResponse
        )
        result += methodSchema.normalize(
            "Streets",
            mapOf("section" to "streets", "ids" to null, "country" to null),
            citiesResponse
        )
        result += methodSchema.normalize(
            "Schools",
            mapOf("section" to "schools", "ids" to null, "country" to null),
            schoolsResponse
        )
        result += methodSchema.normalize(
            "DecodeSchools",
            mapOf("section" to "schools", "q" to null, "country" to null, "cities" to null),
            schoolsResponse
        )

        return result
    }
}
