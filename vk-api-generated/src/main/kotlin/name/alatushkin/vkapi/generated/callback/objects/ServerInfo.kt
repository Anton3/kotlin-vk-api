package name.anton3.vkapi.generated.callback.objects

/**
 * No description
 *
 * @property id Server Id
 * @property title Page title
 * @property creatorId User Id
 * @property url server url
 * @property secretKey secret key
 * @property status status
 */
data class ServerInfo(
    val id: Long? = null,
    val title: String? = null,
    val creatorId: Long? = null,
    val url: String? = null,
    val secretKey: String? = null,
    val status: ServerInfoStatus? = null
)
