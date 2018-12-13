package name.alatushkin.api.vk.generated.account.objects

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
