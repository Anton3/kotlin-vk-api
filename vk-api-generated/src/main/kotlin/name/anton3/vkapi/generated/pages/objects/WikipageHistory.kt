@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.pages.objects

import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Version ID
 * @property length Page size in bytes
 * @property date Date when the page has been edited in Unixtime
 * @property editorId Last editor ID
 * @property editorName Last editor name
 */
data class WikipageHistory(
    val id: Int,
    val length: Int,
    val date: VkDate,
    val editorId: Int,
    val editorName: String
)
