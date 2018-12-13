package name.alatushkin.api.vk.generated.stories.objects

import name.alatushkin.api.vk.generated.common.objects.BoolInt
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.vktypes.VkDate

data class Story(
    val id: Long,
    val ownerId: Long,
    val date: VkDate? = null,
    val seen: BoolInt? = null,
    val type: StoryType? = null,
    val photo: Photo? = null,
    val video: StoryVideo? = null,
    val views: Long? = null,
    val canSee: BoolInt? = null,
    val canReply: BoolInt? = null,
    val canShare: BoolInt? = null,
    val canComment: BoolInt? = null,
    val isDeleted: Boolean? = null,
    val isExpired: Boolean? = null,
    val accessKey: String? = null,
    val parentStoryOwnerId: Long? = null,
    val parentStoryId: Long? = null,
    val parentStoryAccessKey: String? = null,
    val parentStory: Story? = null,
    val link: StoryLink? = null,
    val replies: List<Replies>? = null
)
