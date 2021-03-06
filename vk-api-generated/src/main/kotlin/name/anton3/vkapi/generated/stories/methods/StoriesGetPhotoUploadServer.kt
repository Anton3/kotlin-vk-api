@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.methods

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import name.anton3.vkapi.generated.stories.objects.ClickableStickers
import name.anton3.vkapi.generated.stories.objects.GetPhotoUploadServerResponse
import name.anton3.vkapi.generated.stories.objects.UploadLinkText
import name.anton3.vkapi.method.UserGroupMethod
import name.anton3.vkapi.method.VkMethod

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
 * @property clickableStickers Serialized clickable sticker object
 */
data class StoriesGetPhotoUploadServer(
    var addToNews: Boolean? = null,
    var userIds: List<Int>? = null,
    var replyToStory: String? = null,
    var linkText: UploadLinkText? = null,
    var linkUrl: String? = null,
    var groupId: Int? = null,
    var clickableStickers: ClickableStickers? = null
) : VkMethod<GetPhotoUploadServerResponse, UserGroupMethod>("stories.getPhotoUploadServer", jacksonTypeRef())
