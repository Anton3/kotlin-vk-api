package name.alatushkin.vkapi.generated

import kotlin.reflect.KClass
import name.alatushkin.vkapi.generated.ads.objects.Criteria
import name.alatushkin.vkapi.generated.ads.objects.CriteriaImpl
import name.alatushkin.vkapi.generated.audio.objects.Audio
import name.alatushkin.vkapi.generated.audio.objects.AudioImpl
import name.alatushkin.vkapi.generated.board.objects.TopicComment
import name.alatushkin.vkapi.generated.board.objects.TopicCommentImpl
import name.alatushkin.vkapi.generated.common.objects.Object
import name.alatushkin.vkapi.generated.common.objects.ObjectImpl
import name.alatushkin.vkapi.generated.groups.objects.Group
import name.alatushkin.vkapi.generated.groups.objects.GroupImpl
import name.alatushkin.vkapi.generated.market.objects.MarketItem
import name.alatushkin.vkapi.generated.market.objects.MarketItemImpl
import name.alatushkin.vkapi.generated.messages.objects.Keyboard
import name.alatushkin.vkapi.generated.messages.objects.KeyboardImpl
import name.alatushkin.vkapi.generated.newsfeed.objects.ListMin
import name.alatushkin.vkapi.generated.newsfeed.objects.ListMinImpl
import name.alatushkin.vkapi.generated.newsfeed.objects.NewsfeedItem
import name.alatushkin.vkapi.generated.newsfeed.objects.NewsfeedItemImpl
import name.alatushkin.vkapi.generated.photos.objects.Photo
import name.alatushkin.vkapi.generated.photos.objects.PhotoImpl
import name.alatushkin.vkapi.generated.stats.objects.WallpostStat
import name.alatushkin.vkapi.generated.stats.objects.WallpostStatImpl
import name.alatushkin.vkapi.generated.users.objects.User
import name.alatushkin.vkapi.generated.users.objects.UserFull
import name.alatushkin.vkapi.generated.users.objects.UserFullImpl
import name.alatushkin.vkapi.generated.users.objects.UserImpl
import name.alatushkin.vkapi.generated.users.objects.UserMin
import name.alatushkin.vkapi.generated.users.objects.UserMinImpl
import name.alatushkin.vkapi.generated.video.objects.Video
import name.alatushkin.vkapi.generated.video.objects.VideoImpl
import name.alatushkin.vkapi.generated.wall.objects.WallComment
import name.alatushkin.vkapi.generated.wall.objects.WallCommentImpl
import name.alatushkin.vkapi.generated.wall.objects.Wallpost
import name.alatushkin.vkapi.generated.wall.objects.WallpostImpl

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
