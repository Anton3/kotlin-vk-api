package name.anton3.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property uploadUrl Upload URL
 * @property userIds Users ID who can to see story.
 */
data class GetPhotoUploadServerResponse(
    val uploadUrl: String,
    val userIds: List<Int>
)
