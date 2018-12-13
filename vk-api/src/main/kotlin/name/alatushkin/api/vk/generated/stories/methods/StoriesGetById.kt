@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.Story
import name.alatushkin.api.vk.tokens.UserGroupMethod
import name.alatushkin.api.vk.vktypes.VkList

/**
 * [https://vk.com/dev/stories.getById]
 *
 * Returns story by its ID.
 *
 * @property stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
 * @property fields Additional fields to return
 */
data class StoriesGetById(
    var stories: List<String>? = null,
    var fields: List<String>? = null
) : VkMethod<VkList<Story>>(
    "stories.getById",
    jacksonTypeRef()
), UserGroupMethod
