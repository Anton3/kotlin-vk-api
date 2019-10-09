package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.databind.jsontype.NamedType
import name.anton3.vkapi.generated.docs.objects.Doc
import name.anton3.vkapi.generated.messages.objects.AudioMessage
import name.anton3.vkapi.generated.messages.objects.MessageGraffiti

internal val saveDocResponseTypes: List<NamedType> = listOf(
    NamedType(Doc::class.java, "doc"),
    NamedType(AudioMessage::class.java, "audio_message"),
    NamedType(MessageGraffiti::class.java, "graffiti")
)
