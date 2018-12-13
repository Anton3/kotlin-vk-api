package name.alatushkin.vkapi.generated.widgets.objects

import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.vktypes.VkDate

data class CommentRepliesItem(
    val cid: Long? = null,
    val uid: Long? = null,
    val date: VkDate? = null,
    val text: String? = null,
    val likes: WidgetLikes? = null,
    val user: UserFull? = null
)
