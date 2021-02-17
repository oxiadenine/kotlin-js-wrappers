package antd.skeleton

import kotlinext.js.jsObject
import react.*

fun RBuilder.skeleton(handler: RHandler<SkeletonProps>) = child(SkeletonComponent::class, handler)
fun RBuilder.skeletonButton(handler: RHandler<SkeletonButtonProps>) = child(SkeletonComponent.Button, jsObject {}, handler)
fun RBuilder.skeletonAvatar(handler: RHandler<SkeletonAvatarProps>) = child(SkeletonComponent.Avatar, jsObject {}, handler)
fun RBuilder.skeletonInput(handler: RHandler<SkeletonInputProps>) = child(SkeletonComponent.Input, jsObject {}, handler)
fun RBuilder.skeletonImage(handler: RHandler<SkeletonImageProps>) = child(SkeletonComponent.Image, jsObject {}, handler)
