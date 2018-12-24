package name.anton3.vkapi.methods.longpoll.events

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
abstract class LongPollEvent(open val eventType: Int)

@JsonFormat(shape = JsonFormat.Shape.ARRAY)
class UnknownLongPollEvent(override val eventType: Int, val eventData: List<Any>) : LongPollEvent(eventType)
