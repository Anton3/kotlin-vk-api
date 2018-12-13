package name.alatushkin.api.vk.generated

import kotlin.reflect.KClass
import name.alatushkin.api.vk.generated.ads.objects.Criteria
import name.alatushkin.api.vk.generated.ads.objects.CriteriaImpl
import name.alatushkin.api.vk.generated.audio.objects.Audio
import name.alatushkin.api.vk.generated.audio.objects.AudioImpl
import name.alatushkin.api.vk.generated.board.objects.TopicComment
import name.alatushkin.api.vk.generated.board.objects.TopicCommentImpl
import name.alatushkin.api.vk.generated.common.objects.Object
import name.alatushkin.api.vk.generated.common.objects.ObjectImpl
import name.alatushkin.api.vk.generated.groups.objects.Group
import name.alatushkin.api.vk.generated.groups.objects.GroupImpl
import name.alatushkin.api.vk.generated.market.objects.MarketItem
import name.alatushkin.api.vk.generated.market.objects.MarketItemImpl
import name.alatushkin.api.vk.generated.messages.objects.Keyboard
import name.alatushkin.api.vk.generated.messages.objects.KeyboardImpl
import name.alatushkin.api.vk.generated.newsfeed.objects.ListMin
import name.alatushkin.api.vk.generated.newsfeed.objects.ListMinImpl
import name.alatushkin.api.vk.generated.newsfeed.objects.NewsfeedItem
import name.alatushkin.api.vk.generated.newsfeed.objects.NewsfeedItemImpl
import name.alatushkin.api.vk.generated.photos.objects.Photo
import name.alatushkin.api.vk.generated.photos.objects.PhotoImpl
import name.alatushkin.api.vk.generated.stats.objects.WallpostStat
import name.alatushkin.api.vk.generated.stats.objects.WallpostStatImpl
import name.alatushkin.api.vk.generated.users.objects.User
import name.alatushkin.api.vk.generated.users.objects.UserFull
import name.alatushkin.api.vk.generated.users.objects.UserFullImpl
import name.alatushkin.api.vk.generated.users.objects.UserImpl
import name.alatushkin.api.vk.generated.users.objects.UserMin
import name.alatushkin.api.vk.generated.users.objects.UserMinImpl
import name.alatushkin.api.vk.generated.video.objects.Video
import name.alatushkin.api.vk.generated.video.objects.VideoImpl
import name.alatushkin.api.vk.generated.wall.objects.WallComment
import name.alatushkin.api.vk.generated.wall.objects.WallCommentImpl
import name.alatushkin.api.vk.generated.wall.objects.Wallpost
import name.alatushkin.api.vk.generated.wall.objects.WallpostImpl

internal fun vkInterfaceMapping(): Map<KClass<out Any>, KClass<out Any>> = mapOf(
    Audio::class to AudioImpl::class,
    UserMin::class to UserMinImpl::class,
    User::class to UserImpl::class,
    UserFull::class to UserFullImpl::class,
    Group::class to GroupImpl::class,
    Wallpost::class to WallpostImpl::class,
    Video::class to VideoImpl::class,
    Keyboard::class to KeyboardImpl::class,
    NewsfeedItem::class to NewsfeedItemImpl::class,
    Photo::class to PhotoImpl::class,
    ListMin::class to ListMinImpl::class,
    Object::class to ObjectImpl::class,
    Criteria::class to CriteriaImpl::class,
    WallpostStat::class to WallpostStatImpl::class,
    MarketItem::class to MarketItemImpl::class,
    TopicComment::class to TopicCommentImpl::class,
    WallComment::class to WallCommentImpl::class
)
