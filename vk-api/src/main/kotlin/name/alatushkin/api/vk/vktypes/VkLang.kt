package name.alatushkin.api.vk.vktypes

enum class VkLang(private val code: Byte) {
    RU(0), UA(1), BE(2), EN(3), ES(4), FI(5), DE(6), IT(7);

    override fun toString() = code.toString()
}
