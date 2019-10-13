@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property description Offer description
 * @property id Offer ID
 * @property img URL of the preview image
 * @property instruction Instruction how to process the offer
 * @property instructionHtml Instruction how to process the offer (HTML format)
 * @property price Offer price
 * @property shortDescription Offer short description
 * @property tag Offer tag
 * @property title Offer title
 */
data class Offer(
    val description: String? = null,
    val id: Int? = null,
    val img: String? = null,
    val instruction: String? = null,
    val instructionHtml: String? = null,
    val price: Int? = null,
    val shortDescription: String? = null,
    val tag: String? = null,
    val title: String? = null
)
