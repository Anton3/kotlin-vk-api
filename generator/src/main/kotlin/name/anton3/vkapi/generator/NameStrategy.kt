package name.anton3.vkapi.generator

import name.anton3.vkapi.generator.source.JsonTypeRef
import name.anton3.vkapi.generator.source.TypeId

typealias NameStrategy = (str: JsonTypeRef, basePackage: String) -> TypeId

fun toCamelCase(string: String): String =
    string.split('.', '_').joinToString("") { it.capitalize() }

private fun beforeDot(path: String) =
    path.substringBefore('.')

private fun splitOnFirstUnderscore(string: String): Pair<String, String> =
    string.substringBefore('_') to string.substringAfter('_')

// notes.edit -> notes.methods.NotesEdit
fun nameMethod(jsonTypeRef: JsonTypeRef, basePackage: String): TypeId {
    return TypeId(
        packages = "${beforeDot(jsonTypeRef)}.methods",
        name = toCamelCase(jsonTypeRef),
        basePackage = basePackage
    )
}

// account_getCounters_response -> account.responses.GetCounterResponse
fun nameResponse(jsonTypeRef: JsonTypeRef, basePackage: String): TypeId {
    val (packageNameSpace, classPart) = splitOnFirstUnderscore(jsonTypeRef)
    return TypeId(
        packages = "$packageNameSpace.responses",
        name = toCamelCase(classPart),
        basePackage = basePackage
    )
}


// photos_photo_xtr_real_offset -> photos.PhotoXtrRealOffset
fun nameObject(jsonTypeRef: JsonTypeRef, basePackage: String): TypeId {
    val (packageNameSpace, classPart) = splitOnFirstUnderscore(jsonTypeRef)
    return TypeId(
        packages = "${alterPackageNameSpace(packageNameSpace)}.objects",
        name = alterClassName(toCamelCase(classPart)),
        basePackage = basePackage
    )
}

private val CLASS_NAMES_ALTERATION = mapOf(
    "OnoffOptions" to "OnOffOptions",
    "List" to "ListMin"
)

fun alterClassName(className: String): String =
    CLASS_NAMES_ALTERATION.getOrDefault(className, className)

private val PACKAGE_NAMES_ALTERATION = mapOf("base" to "common")

fun alterPackageNameSpace(packageNameSpace: String): String =
    PACKAGE_NAMES_ALTERATION.getOrDefault(packageNameSpace, packageNameSpace)


fun mergeEqualTypes(old: TypeId, new: TypeId, basePackage: String): TypeId? {
    val candidateName = splitCamelCase(old.name).commonSuffix(splitCamelCase(new.name)).joinToString("")

    val name1 = MERGE_RULES.getOrDefault(old.name, old.name)
    val name2 = MERGE_RULES.getOrDefault(new.name, new.name)

    val newName = when {
        name1 == name2 -> name1
        candidateName.isNotEmpty() -> candidateName
        else -> return null
    }

    return if (old.packages == new.packages) {
        TypeId(old.packages, newName)
    } else {
        TypeId("common.objects", newName, basePackage = basePackage)
    }
}

private val MERGE_RULES = mapOf(
    "SaveAccessEdit" to "Access",
    "SaveAccessView" to "Access",
    "EditAccess" to "Visibility",
    "GroupIsClosed" to "Visibility",
    "EditPhotos" to "SectionAccess",
    "EditTopics" to "SectionAccess",
    "EditVideo" to "SectionAccess",
    "EditAudio" to "SectionAccess",
    "EditDocs" to "SectionAccess",
    "EditWiki" to "SectionAccess",
    "SaveProfileInfoSex" to "OwnSex",
    "SignupSex" to "OwnSex"
)

private fun splitCamelCase(string: String): List<String> {
    val wordRegex = Regex("""\p{Upper}\p{Lower}*""")
    return wordRegex.findAll(string).map { it.value }.toList()
}

private fun <T> Iterable<T>.commonSuffix(other: Iterable<T>): List<T> {
    return this.reversed().zip(other.reversed()).takeWhile { (e1, e2) -> e1 == e2 }.map { it.first }.reversed()
}
