@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.leads.objects

import name.anton3.vkapi.vktypes.ValueEnum

enum class GetUsersStatus(override val value: Int) : ValueEnum<Int> {
    START(0),
    FINISH(1),
    BLOCKING_USERS(2),
    START_IN_TEST_MODE(3),
    FINISH_IN_TEST_MODE(4)
}
