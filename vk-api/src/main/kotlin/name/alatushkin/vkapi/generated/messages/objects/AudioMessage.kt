package name.alatushkin.vkapi.generated.messages.objects

data class AudioMessage(
    val id: Long,
    val ownerId: Long,
    val duration: Long,
    val linkOgg: String,
    val linkMp3: String,
    val accessKey: String,
    val waveform: List<Long>
) : MessageAttachment
