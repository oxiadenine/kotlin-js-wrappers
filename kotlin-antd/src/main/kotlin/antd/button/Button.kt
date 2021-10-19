@file:JsModule("antd/lib/button")
@file:JsNonModule

package antd.button

import antd.*
import antd.ReactNode
import antd.configprovider.SizeType
import org.w3c.dom.HTMLElement
import react.*

@JsName("default")
external object ButtonComponent : Component<ButtonProps, ButtonState> {
    val Group: ButtonGroupComponent

    override fun render(): ReactElement?
}

external interface ButtonProps : AnchorButtonProps, NativeButtonProps, RefAttributes<HTMLElement>, Props

external interface ButtonState : State {
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
    var icon: ReactNode?
    var shape: ButtonShape?
    var size: SizeType?
    var loading: Any? /* Boolean | ButtonLoadingProps */
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var ghost: Boolean?
    var danger: Boolean?
    var block: Boolean?
    var children: Any?
}

external interface ButtonLoadingProps {
    var delay: Number?
}
