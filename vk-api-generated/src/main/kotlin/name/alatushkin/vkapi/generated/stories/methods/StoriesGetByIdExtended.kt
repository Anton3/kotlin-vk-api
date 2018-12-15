@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.vkapi.core.VkMethod
import name.alatushkin.vkapi.generated.stories.objects.GetByIdExtendedResponse
import name.alatushkin.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getById]
 *
 * Returns story by its ID.
 *
 * @property stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
 * @property fields Additional fields to return
 */
data class StoriesGetByIdExtended(
    var stories: List<String>? = null,
    var fields: List<String>? = null
) : VkMethod<GetByIdExtendedResponse>("stories.getById", jacksonTypeRef()),
    UserGroupMethod {
    init {
        unsafeParam("extended", "1")
    }
}
