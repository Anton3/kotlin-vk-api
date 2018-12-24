package name.anton3.vkapi.generated.stories.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetPhotoUploadServerLinkText(@JsonValue override val value: String) : Value<String> {
    TO_STORE("to_store"),
    VOTE("vote"),
    MORE("more"),
    BOOK("book"),
    ORDER("order"),
    ENROLL("enroll"),
    FILL("fill"),
    SIGNUP("signup"),
    BUY("buy"),
    TICKET("ticket"),
    WRITE("write"),
    OPEN("open"),
    LEARN_MORE("learn_more"),
    VIEW("view"),
    GO_TO("go_to"),
    CONTACT("contact"),
    WATCH("watch"),
    PLAY("play"),
    INSTALL("install"),
    READ("read");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetPhotoUploadServerLinkText = parseEnum(value)
    }
}
