@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.fave.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.common.objects.UserGroupFields
import name.anton3.vkapi.generated.fave.objects.GetPagesType
import name.anton3.vkapi.generated.fave.objects.Page
import name.anton3.vkapi.method.UserMethod
import name.anton3.vkapi.method.VkMethod
import name.anton3.vkapi.vktypes.VkList

/**
 * [https://vk.com/dev/fave.getPages]
 *
 * No description
 *
 * @property offset No description
 * @property count No description
 * @property type No description
 * @property fields No description
 * @property tagId No description
 */
data class FaveGetPages(
    var offset: Int? = null,
    var count: Int? = null,
    var type: GetPagesType? = null,
    var fields: List<UserGroupFields>? = null,
    var tagId: Int? = null
) : VkMethod<VkList<Page>, UserMethod>("fave.getPages", jacksonTypeRef())
