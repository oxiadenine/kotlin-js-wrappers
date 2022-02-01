package antd.skeleton

import kotlinext.js.jso
import react.*

fun RBuilder.skeleton(handler: RHandler<SkeletonProps>) = child(SkeletonComponent::class, handler)
fun RBuilder.skeletonButton(handler: RHandler<SkeletonButtonProps>) = child(SkeletonComponent.Button, jso {}, handler)
fun RBuilder.skeletonAvatar(handler: RHandler<SkeletonAvatarProps>) = child(SkeletonComponent.Avatar, jso {}, handler)
fun RBuilder.skeletonInput(handler: RHandler<SkeletonInputProps>) = child(SkeletonComponent.Input, jso {}, handler)
fun RBuilder.skeletonImage(handler: RHandler<SkeletonImageProps>) = child(SkeletonComponent.Image, jso {}, handler)
