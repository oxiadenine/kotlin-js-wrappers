@file:JsModule("antd/lib/input")
@file:JsNonModule

package antd.input

import antd.InputHTMLAttributes
import antd.KeyboardEventHandler
import org.w3c.dom.HTMLInputElement
import react.*

@JsName("default")
external object InputComponent : Component<InputProps, RState> {
    val Group: InputGroupComponent
    val Search: SearchComponent
    val TextArea: TextAreaComponent
    val Password: PasswordComponent

    override fun render(): ReactElement?
}

external interface InputProps : InputHTMLAttributes<HTMLInputElement>, RProps {
    var prefixCls: String?
    override var size: InputSize?
    var onPressEnter: KeyboardEventHandler<HTMLInputElement>?
    var addonBefore: Any? /* String | ReactElement */
    var addonAfter: Any? /* String | ReactElement */
    override var prefix: dynamic /* String | ReactElement */
    var suffix: Any? /* String | ReactElement */
    var allowClear: Boolean?
}
