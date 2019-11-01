@file:Suppress("unused", "SpellCheckingInspection")

package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property accessKey Access key for private object.
 * @property canComment Information whether current user can comment the story (0 - no, 1 - yes).
 * @property canReply Information whether current user can reply to the story (0 - no, 1 - yes).
 * @property canSee Information whether current user can see the story (0 - no, 1 - yes).
 * @property canShare Information whether current user can share the story (0 - no, 1 - yes).
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
 * @property replies Replies to current story.
 * @property seen Information whether current user has seen the story or not (0 - no, 1 - yes).
 * @property type No description
 * @property video No description
 * @property views Views number.
 * @property isRestricted Does author have stories privacy restrictions
 * @property noSound Is video without sound
 * @property needMute Does video need to be muted
 * @property canAsk Information whether story has question sticker and current user can send question to the author
 * @property canAskAnonymous Information whether story has question sticker and current user can send anonymous question to the author
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
