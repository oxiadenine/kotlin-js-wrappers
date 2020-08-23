@file:JsModule("antd/lib/button")
@file:JsNonModule

package antd.button

import antd.AnchorHTMLAttributes
import antd.ButtonHTMLAttributes
import antd.MouseEventHandler
import react.*

@JsName("default")
external object ButtonComponent : Component<ButtonProps, ButtonState> {
    val Group: ButtonGroupComponent

    override fun render(): ReactElement?
}

external interface ButtonProps : AnchorButtonProps, NativeButtonProps, RProps

external interface ButtonState : RState {
    var loading: Any? /* Boolean | ButtonLoading */
    var hasTwoCNChar: Boolean
}

external interface AnchorButtonProps : BaseButtonProps, AnchorHTMLAttributes<Any> {
    override var href: String?
    override var target: String?
    override var onClick: MouseEventHandler<Any /* HTMLElement */>?
}

external interface NativeButtonProps : BaseButtonProps, ButtonHTMLAttributes<Any> {
    var htmlType: ButtonHTMLType?
    override var onClick: MouseEventHandler<Any /* HTMLElement */>?
}

external interface BaseButtonProps {
    var type: ButtonType?
    var icon: String?
    var shape: ButtonShape?
    var size: ButtonSize?
    var loading: Any? /* Boolean | ButtonLoading */
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var ghost: Boolean?
    var block: Boolean?
    var children: ReactElement?
}

external interface ButtonLoading {
    var delay: Number?
}
