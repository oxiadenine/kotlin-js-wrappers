@file:JsModule("antd/lib/icon")
@file:JsNonModule

package antd.icon

import antd.KeyboardEventHandler
import antd.MouseEventHandler
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object IconComponent : Component<IconProps, RState> {
    fun createFromIconfontCN(options: CustomIconOptions? = definedExternally): Any
    fun getTwoToneColor(): String
    fun setTwoToneColor(primaryColor: String)

    override fun render(): ReactElement?
}

external interface IconProps : RProps {
    var tabIndex: Number?
    var type: String?
    var className: String?
    var theme: ThemeType?
    var title: String?
    var onKeyUp: KeyboardEventHandler<HTMLElement>?
    var onClick: MouseEventHandler<HTMLElement>?
    var component: dynamic /* JsClass<Component<CustomIconComponentProps, RState>> */
    var twoToneColor: String?
    var viewBox: String?
    var spin: Boolean?
    var rotate: Number?
    var style: dynamic
    var prefixCls: String?
    var role: String?
    var disabled: Boolean?
}

external interface CustomIconComponentProps : RProps {
    var width: Any /* String | Number */
    var height: Any /* String | Number */
    var fill: String
    var viewBox: String?
    var className: String?
    var style: dynamic
    var spin: Boolean?
    var rotate: Number?
    /* ['aria-hidden']?: AriaAttributes['aria-hidden'] */
}
