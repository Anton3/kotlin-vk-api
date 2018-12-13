package name.alatushkin.api.vk.generated.database.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.common.objects.Object

data class City(
    val area: String? = null,
    val region: String? = null,
    val important: BoolInt? = null,
    override val id: Long,
    override val title: String
) : Object
