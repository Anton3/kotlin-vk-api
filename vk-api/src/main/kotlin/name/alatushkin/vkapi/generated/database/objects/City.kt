package name.alatushkin.vkapi.generated.database.objects

import name.alatushkin.vkapi.generated.common.objects.BoolInt
import name.alatushkin.vkapi.generated.common.objects.Object

data class City(
    val area: String? = null,
    val region: String? = null,
    val important: BoolInt? = null,
    override val id: Long,
    override val title: String
) : Object
