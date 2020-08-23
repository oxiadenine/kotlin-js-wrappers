@file:JsModule("antd/lib/input-number")
@file:JsNonModule

package antd.inputnumber

import antd.InputHTMLAttributes
import org.w3c.dom.HTMLInputElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object InputNumberComponent : Component<InputNumberProps, RState> {
    override fun render(): ReactElement?
}

external interface InputNumberProps : InputHTMLAttributes<HTMLInputElement>, RProps {
    var prefixCls: String?
    override var min: Any?
    override var max: Any?
    override var value: Any?
    override var step: Any? /* Number | String */
    override var defaultValue: Any?
    override var tabIndex: Number?
    override var onChange: dynamic /* (value: Number?) -> Unit */
    override var disabled: Boolean?
    override var size: InputNumberSize?
    var formatter: ((value: Any? /* Number | String */) -> String)?
    var parser: ((displayValue: String?) -> Any /* Number | String */)?
    var decimalSeparator: String?
    override var placeholder: String?
    override var style: dynamic
    override var className: String?
    override var name: String?
    override var id: String?
    var precision: Number?
}
