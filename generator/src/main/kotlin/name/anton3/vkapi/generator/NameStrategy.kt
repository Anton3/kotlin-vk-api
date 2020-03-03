package name.anton3.vkapi.generator

import name.anton3.vkapi.generator.source.JsonTypeRef
import name.anton3.vkapi.generator.source.TypeId
import org.apache.logging.log4j.kotlin.logger

private val logger = logger("NameStrategy")

typealias NameStrategy = (str: JsonTypeRef, basePackage: String) -> TypeId

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
        packages = "${PACKAGE_NAMES_ALTERATION.getOrSame(packageNameSpace)}.objects",
        name = CLASS_NAMES_ALTERATION.getOrSame(toCamelCase(classPart)),
        basePackage = basePackage
    )
}

private val CLASS_NAMES_ALTERATION = mapOf(
    "OnoffOptions" to "OnOffOptions",
    "List" to "ListMin"
)

private val PACKAGE_NAMES_ALTERATION = mapOf("base" to "common")


fun mergeEqualTypes(old: TypeId, new: TypeId, basePackage: String): TypeId? {
    if (old.name in MERGE_AVOID || new.name in MERGE_AVOID) return null

    val name1 = MERGE_GROUPS.getOrDefault(old.name, old.name)
    val name2 = MERGE_GROUPS.getOrDefault(new.name, new.name)

    val newName = when {
        name1 == name2 -> name1
        old.name.startsWith(new.name) -> old.name
        new.name.startsWith(old.name) -> new.name
        else -> {
            logger.warn("Equal types $old and $new were not merged, please add a merge rule")
            return null
        }
    }

    return if (old.packages == new.packages) {
        TypeId(old.packages, newName)
    } else {
        TypeId("common.objects", newName, basePackage = basePackage)
    }
}

private val MERGE_AVOID: Set<String> = setOf()

private val MERGE_GROUPS: Map<String, String> = mapOf(
    "Access" to listOf("SaveAccessEdit", "SaveAccessView"),
    "GroupAccess" to listOf("GroupAccess", "EditAccess", "GroupIsClosed"),
    "SectionAccess" to listOf("EditPhotos", "EditTopics", "EditAudio", "EditDocs", "EditWiki"),
    "OwnSex" to listOf("SaveProfileInfoSex", "SignupSex"),
    "HistoryMessageAttachmentType" to listOf("HistoryMessageAttachmentType", "GetHistoryAttachmentsMediaType"),
    "GroupAdminLevel" to listOf("GroupAdminLevel", "GroupXtrInvitedByAdminLevel"),
    "GroupType" to listOf("GroupXtrInvitedByType", "SearchType"),
    "ObjectType" to listOf("ObjectType", "GetStatisticsIdsType"),
    "RequestType" to listOf("GetFriendsListType", "SendRequestType"),
    "IdsType" to listOf("GetDemographicsIdsType", "GetPostsReachIdsType"),
    "GroupingPeriod" to listOf("GetDemographicsPeriod", "GetStatisticsPeriod"),
    "ItemType" to listOf("GetItemType", "SetTagsItemType"),
    "NameCase" to listOf(
        "GetNameCase", "GetSuggestionsNameCase", "SearchNameCase", "GetInvitedUsersNameCase", "GetBannedNameCase",
        "GetVotersNameCase", "GetFollowersNameCase"
    ),
    "SectionVisibility" to listOf("GroupTopics", "GroupPhotos", "GroupVideo", "GroupAudio", "GroupDocs", "GroupWiki"),
    "RoleOptions" to listOf("RoleOptions", "MemberRoleStatus"),
    "ReportReason" to listOf("ReportReason", "ReportCommentReason", "ReportPostReason"),
    "NewsfeedFilter" to listOf("CommentsFilters", "UnsubscribeType"),
    "ChronologicalSort" to listOf("GetHistoryRev", "GetSort"),
    "AlbumPrivacy" to listOf("AddAlbumPrivacy", "EditAlbumPrivacy"),
    "AdStatus" to listOf("AdStatus", "CampaignStatus")
).flatMap { (k, v) -> v.map { it to k } }.toMap()


fun toCamelCase(string: String): String =
    string.split('.', '_').joinToString("") { it.capitalize() }

private fun beforeDot(path: String) =
    path.substringBefore('.')

private fun splitOnFirstUnderscore(string: String): Pair<String, String> =
    string.substringBefore('_') to string.substringAfter('_')

@Suppress("NOTHING_TO_INLINE")
private inline fun <T> Map<T, T>.getOrSame(key: T): T = get(key) ?: key

private fun splitCamelCase(string: String): List<String> {
    val wordRegex = Regex("""\p{Upper}\p{Lower}*""")
    return wordRegex.findAll(string).map { it.value }.toList()
}

private fun <T> Iterable<T>.commonSuffix(other: Iterable<T>): List<T> {
    return this.reversed().zip(other.reversed()).takeWhile { (e1, e2) -> e1 == e2 }.map { it.first }.reversed()
}
