package name.anton3.vkapi.generated.messages.objects

/**
 * information about location
 *
 * @property id destination ID
 * @property type conversation type
 * @property localId local destination ID. For conversations — id - 2000000000, for community — -id, for e-mail — -(id+2000000000).
 */
data class ConversationPeer(
    val id: Long,
    val type: ConversationPeerType,
    val localId: Long
)
