@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property msg No description
 * @property chat No description
 * @property friend No description
 * @property friendFound No description
 * @property friendAccepted No description
 * @property reply No description
 * @property comment No description
 * @property mention No description
 * @property like No description
 * @property repost No description
 * @property wallPost No description
 * @property wallPublish No description
 * @property groupInvite No description
 * @property groupAccepted No description
 * @property eventSoon No description
 * @property photosTag No description
 * @property appRequest No description
 * @property sdkOpen No description
 * @property newPost No description
 * @property birthday No description
 */
data class PushParams(
    val msg: List<PushParamsMode>? = null,
    val chat: List<PushParamsMode>? = null,
    val friend: List<OnOffOptions>? = null,
    val friendFound: List<OnOffOptions>? = null,
    val friendAccepted: List<OnOffOptions>? = null,
    val reply: List<OnOffOptions>? = null,
    val comment: List<PushParamsSettings>? = null,
    val mention: List<PushParamsSettings>? = null,
    val like: List<PushParamsSettings>? = null,
    val repost: List<PushParamsSettings>? = null,
    val wallPost: List<OnOffOptions>? = null,
    val wallPublish: List<OnOffOptions>? = null,
    val groupInvite: List<OnOffOptions>? = null,
    val groupAccepted: List<OnOffOptions>? = null,
    val eventSoon: List<OnOffOptions>? = null,
    val photosTag: List<PushParamsSettings>? = null,
    val appRequest: List<OnOffOptions>? = null,
    val sdkOpen: List<OnOffOptions>? = null,
    val newPost: List<OnOffOptions>? = null,
    val birthday: List<OnOffOptions>? = null
)
