@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.account.objects

/**
 * No description
 *
 * @property msg No description
 * @property chat No description
 * @property like No description
 * @property repost No description
 * @property comment No description
 * @property mention No description
 * @property reply No description
 * @property newPost No description
 * @property wallPost No description
 * @property wallPublish No description
 * @property friend No description
 * @property friendFound No description
 * @property friendAccepted No description
 * @property groupInvite No description
 * @property groupAccepted No description
 * @property birthday No description
 * @property eventSoon No description
 * @property appRequest No description
 * @property sdkOpen No description
 */
data class PushParams(
    val msg: List<PushParamsMode>? = null,
    val chat: List<PushParamsMode>? = null,
    val like: List<PushParamsSettings>? = null,
    val repost: List<PushParamsSettings>? = null,
    val comment: List<PushParamsSettings>? = null,
    val mention: List<PushParamsSettings>? = null,
    val reply: List<PushParamsOnoff>? = null,
    val newPost: List<PushParamsOnoff>? = null,
    val wallPost: List<PushParamsOnoff>? = null,
    val wallPublish: List<PushParamsOnoff>? = null,
    val friend: List<PushParamsOnoff>? = null,
    val friendFound: List<PushParamsOnoff>? = null,
    val friendAccepted: List<PushParamsOnoff>? = null,
    val groupInvite: List<PushParamsOnoff>? = null,
    val groupAccepted: List<PushParamsOnoff>? = null,
    val birthday: List<PushParamsOnoff>? = null,
    val eventSoon: List<PushParamsOnoff>? = null,
    val appRequest: List<PushParamsOnoff>? = null,
    val sdkOpen: List<PushParamsOnoff>? = null
)
