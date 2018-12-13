package name.alatushkin.api.vk.generated.pages.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.wall.objects.CommentAttachment
import name.alatushkin.api.vk.generated.wall.objects.WallpostAttachment

data class WikipageFull(
    val id: Long,
    val groupId: Long,
    val title: String,
    val currentUserCanEdit: BoolInt? = null,
    val currentUserCanEditAccess: BoolInt? = null,
    val whoCanView: PrivacySettings,
    val whoCanEdit: PrivacySettings,
    val edited: Long,
    val created: Long,
    val views: Long,
    val editorId: Long? = null,
    val creatorId: Long? = null,
    val source: String? = null,
    val html: String? = null,
    val viewUrl: String
) : WallpostAttachment,
    CommentAttachment
