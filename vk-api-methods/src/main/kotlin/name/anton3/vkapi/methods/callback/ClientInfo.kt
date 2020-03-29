package name.anton3.vkapi.methods.callback

import name.anton3.vkapi.vktypes.VkLang

data class ClientInfo(
    val buttonActions: List<String>,
    val keyboard: Boolean = false,
    val inlineKeyboard: Boolean = false,
    val carousel: Boolean = false,
    val langId: VkLang = VkLang.RU
)
