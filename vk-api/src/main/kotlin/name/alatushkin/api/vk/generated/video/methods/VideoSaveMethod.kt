@file:Suppress("unused", "MemberVisibilityCanBePrivate", "SpellCheckingInspection")

package name.alatushkin.api.vk.generated.video.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkResponse
import name.alatushkin.api.vk.generated.video.SaveResult
import name.alatushkin.api.vk.tokens.UserMethod

/**
 * [https://vk.com/dev/video.save]
 *
 * Returns a server address (required for upload) and video data.
 *
 * @property name Name of the video.
 * @property description Description of the video.
 * @property isPrivate '1' — to designate the video as private (send it via a private message), the video will not appear on the user's video list and will not be available by ID for other users, '0' — not to designate the video as private
 * @property wallpost '1' — to post the saved video on a user's wall, '0' — not to post the saved video on a user's wall
 * @property link URL for embedding the video from an external website.
 * @property groupId ID of the community in which the video will be saved. By default, the current user's page.
 * @property albumId ID of the album to which the saved video will be added.
 * @property privacyView 
 * @property privacyComment 
 * @property noComments 
 * @property repeat '1' — to repeat the playback of the video, '0' — to play the video once,
 */
class VideoSaveMethod(
        name: String? = null,
        description: String? = null,
        isPrivate: Boolean? = null,
        wallpost: Boolean? = null,
        link: String? = null,
        groupId: Long? = null,
        albumId: Long? = null,
        privacyView: Array<String>? = null,
        privacyComment: Array<String>? = null,
        noComments: Boolean? = null,
        repeat: Boolean? = null
) : VkMethod<SaveResult>(
    "video.save",
    mutableMapOf(),
    object : TypeReference<VkResponse<SaveResult>>() {}
), UserMethod {

    var name: String? by props
    var description: String? by props
    var isPrivate: Boolean? by props
    var wallpost: Boolean? by props
    var link: String? by props
    var groupId: Long? by props
    var albumId: Long? by props
    var privacyView: Array<String>? by props
    var privacyComment: Array<String>? by props
    var noComments: Boolean? by props
    var repeat: Boolean? by props

    init {
        this.name = name
        this.description = description
        this.isPrivate = isPrivate
        this.wallpost = wallpost
        this.link = link
        this.groupId = groupId
        this.albumId = albumId
        this.privacyView = privacyView
        this.privacyComment = privacyComment
        this.noComments = noComments
        this.repeat = repeat
    }

    fun setName(name: String): VideoSaveMethod {
        this.name = name
        return this
    }

    fun setDescription(description: String): VideoSaveMethod {
        this.description = description
        return this
    }

    fun setIsPrivate(isPrivate: Boolean): VideoSaveMethod {
        this.isPrivate = isPrivate
        return this
    }

    fun setWallpost(wallpost: Boolean): VideoSaveMethod {
        this.wallpost = wallpost
        return this
    }

    fun setLink(link: String): VideoSaveMethod {
        this.link = link
        return this
    }

    fun setGroupId(groupId: Long): VideoSaveMethod {
        this.groupId = groupId
        return this
    }

    fun setAlbumId(albumId: Long): VideoSaveMethod {
        this.albumId = albumId
        return this
    }

    fun setPrivacyView(privacyView: Array<String>): VideoSaveMethod {
        this.privacyView = privacyView
        return this
    }

    fun setPrivacyComment(privacyComment: Array<String>): VideoSaveMethod {
        this.privacyComment = privacyComment
        return this
    }

    fun setNoComments(noComments: Boolean): VideoSaveMethod {
        this.noComments = noComments
        return this
    }

    fun setRepeat(repeat: Boolean): VideoSaveMethod {
        this.repeat = repeat
        return this
    }
}
