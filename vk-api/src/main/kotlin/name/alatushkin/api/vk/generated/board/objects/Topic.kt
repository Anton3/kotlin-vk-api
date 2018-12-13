package name.alatushkin.api.vk.generated.board.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.notifications.objects.NotificationParent

data class Topic(
    val id: Long? = null,
    val title: String? = null,
    val created: Long? = null,
    val createdBy: Long? = null,
    val updated: Long? = null,
    val updatedBy: Long? = null,
    val isClosed: BoolInt? = null,
    val isFixed: BoolInt? = null,
    val comments: Long? = null
) : NotificationParent
