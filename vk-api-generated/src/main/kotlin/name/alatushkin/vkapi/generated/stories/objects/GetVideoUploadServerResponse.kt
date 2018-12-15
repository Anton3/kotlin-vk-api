package name.alatushkin.vkapi.generated.stories.objects

/**
 * No description
 *
 * @property uploadUrl Upload URL
 * @property userIds Users ID who can to see story.
 */
data class GetVideoUploadServerResponse(
    val uploadUrl: String,
    val userIds: List<Long>
)
