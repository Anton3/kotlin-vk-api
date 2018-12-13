package name.alatushkin.api.vk.generated.widgets.objects

import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.vktypes.VkDate

data class CommentRepliesItem(
    val cid: Long? = null,
    val uid: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val likes: WidgetLikes? = null,
    val user: UserFull? = null
)
