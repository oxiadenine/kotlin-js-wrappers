@file:JsModule("@ant-design/icons/lib/components/Icon")
@file:JsNonModule

package antd.icon

import antd.*
import react.*

@JsName("default")
external class IconComponent : Component<IconProps, RState> {
    val getTwoToneColor: () -> TwoToneColor
    val setTwoToneColor: (twoToneColor: TwoToneColor) -> Unit

    override fun render(): ReactElement?
}

external interface IconProps : IconBaseProps {
    var viewBox: String?
    var component: dynamic
    var ariaLabel: AriaAttributes
}

external interface IconBaseProps : RProps {
    var spin: Boolean?
    var rotate: Number?
    var twoToneColor: TwoToneColor?
    var className: String?
    var style: dynamic
    var onClick: MouseEventHandler<Any>?
}

external interface CustomIconComponentProps : RProps {
    var width: Any /* String | Number */
    var height: Any /* String | Number */
    var fill: String
    var viewBox: String
    var className: String
    var style: dynamic
}
