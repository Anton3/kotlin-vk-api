package name.anton3.vkapi.generated.ads.objects

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import name.anton3.vkapi.vktypes.Value
import name.anton3.vkapi.vktypes.parseEnum

enum class GetDemographicsIdsType(@JsonValue override val value: String) : Value<String> {
    AD("ad"),
    CAMPAIGN("campaign");

    companion object {
        @JvmStatic
        @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
        fun parse(value: String): GetDemographicsIdsType = parseEnum(value)
    }
}
