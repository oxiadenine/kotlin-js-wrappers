package antd.input

import antd.MouseEvent
import antd.configprovider.DirectionType
import antd.configprovider.SizeType
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object ClearableLabeledInputComponent : Component<ClearableInputProps, RState> {
    val Group: GroupComponent
    val Search: SearchComponent
    val TextArea: TextAreaComponent
    val Password: PasswordComponent

    override fun render(): ReactElement?
}

external interface ClearableInputProps : BasicProps, RProps {
    var size: SizeType?
    var suffix: Any? /* String | ReactElement */
    var prefix: Any? /* String | ReactElement */
    var addonBefore: Any? /* String | ReactElement */
    var addonAfter: Any? /* String | ReactElement */
    var triggerFocus: (() -> Unit)?
}

external interface BasicProps {
    var prefixCls: String
    var inputType: ClearableInputType
    var value: Any?
    var allowClear: Boolean?
    var element: ReactElement
    var handleReset: (event: MouseEvent<HTMLElement>) -> Unit
    var className: String?
    var style: dynamic
    var disabled: Boolean
    var direction: DirectionType?
    var focused: Boolean?
    var readOnly: Boolean?
    var bordered: Boolean
}
