package name.anton3.vkapi.generated.board.objects

import name.anton3.vkapi.generated.notifications.objects.NotificationParent

/**
 * No description
 *
 * @property id Topic ID
 * @property title Topic title
 * @property created Date when the topic has been created in Unixtime
 * @property createdBy Creator ID
 * @property updated Date when the topic has been updated in Unixtime
 * @property updatedBy ID of user who updated the topic
 * @property isClosed Information whether the topic is closed
 * @property isFixed Information whether the topic is fixed
 * @property comments Comments number
 */
data class Topic(
    val id: Long? = null,
    val title: String? = null,
    val created: Long? = null,
    val createdBy: Long? = null,
    val updated: Long? = null,
    val updatedBy: Long? = null,
    val isClosed: Boolean? = null,
    val isFixed: Boolean? = null,
    val comments: Long? = null
) : NotificationParent
