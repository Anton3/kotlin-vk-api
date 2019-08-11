package name.anton3.vkapi.generated.stories.objects

import name.anton3.vkapi.generated.photos.objects.Photo
import name.anton3.vkapi.vktypes.BoolInt
import name.anton3.vkapi.vktypes.VkDate

/**
 * No description
 *
 * @property id Story ID.
 * @property ownerId Story owner's ID.
 * @property date Date when story has been added in Unixtime.
 * @property seen Information whether current user has seen the story or not (0 - no, 1 - yes).
 * @property type No description
 * @property photo No description
 * @property video No description
 * @property views Views number.
 * @property canSee Information whether current user can see the story (0 - no, 1 - yes).
 * @property canReply Information whether current user can reply to the story (0 - no, 1 - yes).
 * @property canShare Information whether current user can share the story (0 - no, 1 - yes).
 * @property canComment Information whether current user can comment the story (0 - no, 1 - yes).
 * @property isDeleted Information whether the story is deleted (false - no, true - yes).
 * @property isExpired Information whether the story is expired (false - no, true - yes).
 * @property accessKey Access key for private object.
 * @property parentStoryOwnerId Parent story owner's ID.
 * @property parentStoryId Parent story ID.
 * @property parentStoryAccessKey Access key for private object.
 * @property parentStory No description
 * @property link No description
 * @property replies Replies to current story.
 */
data class Story(
    val id: Int,
    val ownerId: Int,
    val date: VkDate? = null,
    val seen: BoolInt? = null,
    val type: StoryType? = null,
    val photo: Photo? = null,
    val video: StoryVideo? = null,
    val views: Int? = null,
    val canSee: BoolInt? = null,
    val canReply: BoolInt? = null,
    val canShare: BoolInt? = null,
    val canComment: BoolInt? = null,
    val isDeleted: Boolean? = null,
    val isExpired: Boolean? = null,
    val accessKey: String? = null,
    val parentStoryOwnerId: Int? = null,
    val parentStoryId: Int? = null,
    val parentStoryAccessKey: String? = null,
    val parentStory: Story? = null,
    val link: StoryLink? = null,
    val replies: List<Replies>? = null
)
