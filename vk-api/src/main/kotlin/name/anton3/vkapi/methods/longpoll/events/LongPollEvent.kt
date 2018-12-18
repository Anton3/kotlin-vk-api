package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import name.anton3.vkapi.methods.longpoll.events.*

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "eventType",
    visible = true
)
@JsonSubTypes(value = [
    JsonSubTypes.Type(MessageFlagsReplace::class, name = "1"),
    JsonSubTypes.Type(MessageFlagsSet::class, name = "2"),
    JsonSubTypes.Type(MessageFlagsUnset::class, name = "3"),
    JsonSubTypes.Type(MessageAdded::class, name = "4"),
    JsonSubTypes.Type(MessageEdited::class, name = "5"),
    JsonSubTypes.Type(IncomingMessageRead::class, name = "6"),
    JsonSubTypes.Type(OutgoingMessageRead::class, name = "7"),
    JsonSubTypes.Type(FriendOnline::class, name = "8"),
    JsonSubTypes.Type(FriendOffline::class, name = "9"),
    JsonSubTypes.Type(ConversationFlagsUnset::class, name = "10"),
    JsonSubTypes.Type(ConversationFlagsReplace::class, name = "11"),
    JsonSubTypes.Type(ConversationFlagsSet::class, name = "12"),
    JsonSubTypes.Type(DeleteMessages::class, name = "13"),
    JsonSubTypes.Type(RestoreMessages::class, name = "14"),
    JsonSubTypes.Type(ChatEdited::class, name = "51"),
    JsonSubTypes.Type(ConversationEdited::class, name = "52"),
    JsonSubTypes.Type(UserTypingInConversation::class, name = "61"),
    JsonSubTypes.Type(UserTypingInChat::class, name = "62"),
    JsonSubTypes.Type(UserCalling::class, name = "70"),
    JsonSubTypes.Type(CounterSet::class, name = "80"),
    JsonSubTypes.Type(NotificationSettingsSet::class, name = "114")
])
abstract class LongPollEvent(open val eventType: Int)
