package name.alatushkin.vkapi.generated.wall.objects

import name.alatushkin.vkapi.generated.common.objects.Geo
import name.alatushkin.vkapi.vktypes.VkDate

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
