@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for private object.
 * @property canComment No description
 * @property canReply No description
 * @property canSee No description
 * @property canShare No description
 * @property date Date when story has been added in Unixtime.
 * @property expiresAt Story expiration time. Unixtime.
 * @property id Story ID.
 * @property isDeleted Information whether the story is deleted (false - no, true - yes).
 * @property isExpired Information whether the story is expired (false - no, true - yes).
 * @property link No description
 * @property ownerId Story owner's ID.
 * @property parentStory No description
 * @property parentStoryAccessKey Access key for private object.
 * @property parentStoryId Parent story ID.
 * @property parentStoryOwnerId Parent story owner's ID.
 * @property photo No description
 * @property replies No description
 * @property seen No description
 * @property type No description
 * @property video No description
 * @property views Views number.
 * @property isRestricted Does author have stories privacy restrictions
 * @property noSound Is video without sound
 * @property needMute Does video need to be muted
 * @property canAsk No description
 * @property canAskAnonymous No description
 */
data class Story(
    val accessKey: String? = null,
    val canComment: BoolInt? = null,
    val canReply: BoolInt? = null,
    val canSee: BoolInt? = null,
    val canShare: BoolInt? = null,
    val date: VkDate? = null,
    val expiresAt: Int? = null,
    val id: Int,
    val isDeleted: Boolean? = null,
    val isExpired: Boolean? = null,
    val link: StoryLink? = null,
    val ownerId: Int,
    val parentStory: Story? = null,
    val parentStoryAccessKey: String? = null,
    val parentStoryId: Int? = null,
    val parentStoryOwnerId: Int? = null,
    val photo: Photo? = null,
    val replies: Replies? = null,
    val seen: BoolInt? = null,
    val type: StoryType? = null,
    val video: StoryVideo? = null,
    val views: Int? = null,
    val isRestricted: Boolean? = null,
    val noSound: Boolean? = null,
    val needMute: Boolean? = null,
    val canAsk: BoolInt? = null,
    val canAskAnonymous: BoolInt? = null
)
