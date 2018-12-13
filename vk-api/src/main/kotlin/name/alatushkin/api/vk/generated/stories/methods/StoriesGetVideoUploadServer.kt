@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.alatushkin.api.vk.core.VkMethod
import name.alatushkin.api.vk.generated.stories.objects.GetVideoUploadServerResponse
import name.alatushkin.api.vk.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getVideoUploadServer]
 *
 * Allows to receive URL for uploading story with video.
 *
 * @property addToNews 1 — to add the story to friend's feed.
 * @property userIds List of users IDs who can see the story.
 * @property replyToStory ID of the story to reply with the current.
 * @property linkText Link text (for community's stories only).
 * @property linkUrl Link URL. Internal links on https://vk.com only.
 * @property groupId ID of the community to upload the story (should be verified or with the "fire" icon).
 */
data class StoriesGetVideoUploadServer(
    var addToNews: Boolean? = null,
    var userIds: List<Long>? = null,
    var replyToStory: String? = null,
    var linkText: String? = null,
    var linkUrl: String? = null,
    var groupId: Long? = null
) : VkMethod<GetVideoUploadServerResponse>(
    "stories.getVideoUploadServer",
    jacksonTypeRef()
), UserGroupMethod
