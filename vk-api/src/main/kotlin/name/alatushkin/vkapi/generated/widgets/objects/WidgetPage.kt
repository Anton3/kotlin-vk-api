package name.alatushkin.vkapi.generated.widgets.objects

import name.alatushkin.vkapi.generated.common.objects.ObjectCount
import name.alatushkin.vkapi.vktypes.VkDate

data class WidgetPage(
    val id: Long? = null,
    val title: String? = null,
    val description: String? = null,
    val photo: String? = null,
    val url: String? = null,
    val likes: ObjectCount? = null,
    val comments: ObjectCount? = null,
    val date: VkDate? = null,
    val pageId: String? = null
)
