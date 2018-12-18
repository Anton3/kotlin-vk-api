package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property id Offer ID
 * @property title Offer title
 * @property instruction Instruction how to process the offer
 * @property instructionHtml Instruction how to process the offer (HTML format)
 * @property shortDescription Offer short description
 * @property description Offer description
 * @property img URL of the preview image
 * @property tag Offer tag
 * @property price Offer price
 */
data class Offer(
    val id: Long? = null,
    val title: String? = null,
    val instruction: String? = null,
    val instructionHtml: String? = null,
    val shortDescription: String? = null,
    val description: String? = null,
    val img: String? = null,
    val tag: String? = null,
    val price: Long? = null
)
