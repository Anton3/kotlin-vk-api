package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.vktypes.BoolInt

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
@JsonDeserialize(`as` = Void::class)
data class Topic(
    val id: Int? = null,
    val title: String? = null,
    val created: Int? = null,
    val createdBy: Int? = null,
    val updated: Int? = null,
    val updatedBy: Int? = null,
    val isClosed: BoolInt? = null,
    val isFixed: BoolInt? = null,
    val comments: Int? = null
) : NotificationParent
