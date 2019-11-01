@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.board.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.anton3.vkapi.generated.notifications.objects.NotificationParent
import name.anton3.vkapi.vktypes.BoolInt

/**
 * No description
 *
 * @property comments Comments number
 * @property created Date when the topic has been created in Unixtime
 * @property createdBy Creator ID
 * @property id Topic ID
 * @property isClosed Information whether the topic is closed
 * @property isFixed Information whether the topic is fixed
 * @property title Topic title
 * @property updated Date when the topic has been updated in Unixtime
 * @property updatedBy ID of user who updated the topic
 */
@JsonDeserialize(`as` = Void::class)
data class Topic(
    val comments: Int? = null,
    val created: Int? = null,
    val createdBy: Int? = null,
    val id: Int? = null,
    val isClosed: BoolInt? = null,
    val isFixed: BoolInt? = null,
    val title: String? = null,
    val updated: Int? = null,
    val updatedBy: Int? = null
) : NotificationParent
