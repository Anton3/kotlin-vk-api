package name.alatushkin.api.vk.vktypes

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import name.alatushkin.api.vk.json.deser.VkBirthDayDeserializer

@JsonDeserialize(using = VkBirthDayDeserializer::class)
data class VkBirthDate(val day: Int, val month: Int, val year: Int?)
