@file:JsModule("antd/lib/input")
@file:JsNonModule

package antd.input

import antd.*
import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

@JsName("default")
external object InputComponent : Component<InputProps, InputState> {
    val Group: GroupComponent
    val Search: SearchComponent
    val TextArea: TextAreaComponent
    val Password: PasswordComponent

    override fun render(): ReactElement?
}

external interface InputProps : InputHTMLAttributes<HTMLInputElement>, RProps {
    var prefixCls: String?
    override var size: SizeType?
    override var type: String? /* "button" | "checkbox" | "color" | "date" | "datetime-local" | "email" | "file" | "hidden" | "image" | "month" | "number" | "password" | "radio" | "range" | "reset" | "search" | "submit" | "tel" | "text" | "time" | "url" | "week" */
    var onPressEnter: KeyboardEventHandler<HTMLInputElement>?
    var addonBefore: ReactNode?
    var addonAfter: ReactNode?
    override var prefix: dynamic /* ReactNode */
    var suffix: ReactNode?
    var allowClear: Boolean?
    var bordered: Boolean?
}

external interface InputState : RState {
    var value: Any
    var focused: Boolean
    var prevValue: Any
}
