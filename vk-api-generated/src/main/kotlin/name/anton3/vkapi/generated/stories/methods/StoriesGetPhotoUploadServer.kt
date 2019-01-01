@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.core.VkMethod
import name.anton3.vkapi.generated.stories.objects.GetPhotoUploadServerLinkText
import name.anton3.vkapi.generated.stories.objects.GetPhotoUploadServerResponse
import name.anton3.vkapi.tokens.UserGroupMethod

/**
 * [https://vk.com/dev/stories.getPhotoUploadServer]
 *
 * Returns URL for uploading a story with photo.
 *
 * @property addToNews 1 — to add the story to friend's feed.
 * @property userIds List of users IDs who can see the story.
 * @property replyToStory ID of the story to reply with the current.
 * @property linkText Link text (for community's stories only).
 * @property linkUrl Link URL. Internal links on https://vk.com only.
 * @property groupId ID of the community to upload the story (should be verified or with the "fire" icon).
 */
data class StoriesGetPhotoUploadServer(
    var addToNews: Boolean? = null,
    var userIds: List<Int>? = null,
    var replyToStory: String? = null,
    var linkText: GetPhotoUploadServerLinkText? = null,
    var linkUrl: String? = null,
    var groupId: Int? = null
) : VkMethod<GetPhotoUploadServerResponse>("stories.getPhotoUploadServer", jacksonTypeRef()),
    UserGroupMethod
