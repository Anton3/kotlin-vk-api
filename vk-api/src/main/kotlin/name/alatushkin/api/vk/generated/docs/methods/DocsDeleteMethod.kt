@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.docs.methods

import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.successReference
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/docs.delete]
 *
 * Deletes a user or community document.
 *
 * @property ownerId ID of the user or community that owns the document. Use a negative value to designate a community ID.
 * @property docId Document ID.
 */
class DocsDeleteMethod(
    ownerId: Long,
    docId: Long
) : VkMethod<Boolean>(
    "docs.delete",
    mutableMapOf(),
    successReference()
), UserMethod {

    var ownerId: Long by props
    var docId: Long by props

    init {
        this.ownerId = ownerId
        this.docId = docId
    }
}
