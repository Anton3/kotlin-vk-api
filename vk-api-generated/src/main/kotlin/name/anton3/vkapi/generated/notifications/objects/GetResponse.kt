@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.notifications.objects

import name.anton3.vkapi.generated.apps.objects.App
import name.anton3.vkapi.generated.groups.objects.Group
import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.generated.users.objects.User
import name.anton3.vkapi.generated.video.objects.Video

/**
 * No description
 *
 * @property count Total number
 * @property items No description
 * @property profiles No description
 * @property groups No description
 * @property lastViewed Time when user has been checked notifications last time
 * @property photos No description
 * @property videos No description
 * @property apps No description
 * @property nextFrom No description
 * @property ttl No description
 */
data class GetResponse(
    val count: Int? = null,
    val items: List<Notification>? = null,
    val profiles: List<User>? = null,
    val groups: List<Group>? = null,
    val lastViewed: Int? = null,
    val photos: List<Photo>? = null,
    val videos: List<Video>? = null,
    val apps: List<App>? = null,
    val nextFrom: String? = null,
    val ttl: Int? = null
)
