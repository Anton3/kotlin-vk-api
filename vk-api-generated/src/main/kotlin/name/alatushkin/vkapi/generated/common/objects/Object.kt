package name.alatushkin.vkapi.generated.common.objects

import com.fasterxml.jackson.databind.annotation.JsonDeserialize

/**
 * No description
 *
 * @property id Object ID
 * @property title Object title
 */
@JsonDeserialize(`as` = ObjectImpl::class)
interface Object {
    val id: Long
    val title: String
}
