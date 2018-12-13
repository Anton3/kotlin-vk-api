package name.alatushkin.api.vk.generated.wall.objects

import name.alatushkin.api.vk.generated.common.objects.Geo
import name.alatushkin.api.vk.vktypes.VkDate

interface Wallpost {
    val id: Long?
    val fromId: Long?
    val ownerId: Long?
    val date: VkDate?
    val views: Views?
    val accessKey: String?
    val postType: PostType?
    val text: String?
    val signerId: Long?
    val attachments: List<WallpostAttachment>?
    val geo: Geo?
    val postSource: PostSource?
}
