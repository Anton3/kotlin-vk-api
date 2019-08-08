package name.anton3.vkapi.json.deserializers

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.deser.std.StdDeserializer
import com.fasterxml.jackson.databind.node.ArrayNode
import com.fasterxml.jackson.databind.node.NumericNode
import com.fasterxml.jackson.module.kotlin.convertValue
import name.anton3.vkapi.json.attributes.forwardableAttributes
import name.anton3.vkapi.json.attributes.reader
import name.anton3.vkapi.json.core.readNode
import name.anton3.vkapi.json.core.strongType
import name.anton3.vkapi.methods.longpoll.events.*

internal object LongPollEventDeserializer : StdDeserializer<LongPollEvent>(LongPollEvent::class.java) {

    override fun deserialize(p: JsonParser, ctxt: DeserializationContext): LongPollEvent {
        val codec = p.codec as ObjectMapper
        val node = p.readNode<ArrayNode>()

        val typeId = (node[0] as NumericNode).intValue()
        val type = eventTypes[typeId] ?: return UnknownLongPollEvent(typeId, codec.convertValue(node))

        return codec.reader(ctxt.forwardableAttributes).readValue(node.traverse(codec), type)
    }

    private val eventTypes = mapOf(
        1 to strongType<MessageFlagsReplace>(),
        2 to strongType<MessageFlagsSet>(),
        3 to strongType<MessageFlagsUnset>(),
        4 to strongType<MessageAdded>(),
        5 to strongType<MessageEdited>(),
        6 to strongType<IncomingMessageRead>(),
        7 to strongType<OutgoingMessageRead>(),
        8 to strongType<FriendOnline>(),
        9 to strongType<FriendOffline>(),
        10 to strongType<ConversationFlagsUnset>(),
        11 to strongType<ConversationFlagsReplace>(),
        12 to strongType<ConversationFlagsSet>(),
        13 to strongType<DeleteMessages>(),
        14 to strongType<RestoreMessages>(),
        51 to strongType<ChatEdited>(),
        52 to strongType<ConversationEdited>(),
        61 to strongType<UserTypingInConversation>(),
        62 to strongType<UserTypingInChat>(),
        70 to strongType<UserCalling>(),
        80 to strongType<CounterSet>(),
        114 to strongType<NotificationSettingsSet>()
    )
}
