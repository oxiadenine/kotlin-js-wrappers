@file:JsModule("antd/lib/badge")
@file:JsNonModule

package antd.badge

import react.*

@JsName("default")
external object BadgeComponent : Component<BadgeProps, RState> {
    val Ribbon: RibbonComponent

    override fun render(): ReactElement?
}

external interface BadgeProps : RProps {
    var count: Any? /* String | ReactElement */
    var showZero: Boolean?
    var overflowCount: Number?
    var dot: Boolean?
    var style: dynamic
    var prefixCls: String?
    var scrollNumberPrefixCls: String?
    var className: String?
    var status: PresetStatusColorType?
    var color: PresetColorType?
    var text: Any? /* String | ReactElement */
    var size: String? /* "default" | "small" */
    var offset: Array<Any /* Number | String */>?
    var title: String?
}
