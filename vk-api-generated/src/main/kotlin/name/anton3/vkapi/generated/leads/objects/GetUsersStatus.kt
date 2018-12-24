package name.anton3.vkapi.generated.leads.objects

import com.fasterxml.jackson.annotation.JsonValue

enum class GetUsersStatus(@get:JsonValue val value: String) {
    START("0"),
    FINISH("1"),
    BLOCKING_USERS("2"),
    START_IN_TEST_MODE("3"),
    FINISH_IN_TEST_MODE("4")
}
