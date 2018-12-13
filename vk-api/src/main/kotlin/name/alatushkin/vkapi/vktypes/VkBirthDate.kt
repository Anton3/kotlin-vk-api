package name.alatushkin.vkapi.vktypes

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.vkapi.json.deser.VkBirthDayDeserializer

@JsonDeserialize(using = VkBirthDayDeserializer::class)
data class VkBirthDate(val day: Int, val month: Int, val year: Int?)
