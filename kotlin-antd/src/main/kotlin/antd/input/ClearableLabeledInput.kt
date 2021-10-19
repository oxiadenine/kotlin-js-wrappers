package antd.input

import antd.MouseEvent
import antd.configprovider.DirectionType
import antd.configprovider.SizeType
import antd.ReactNode
import org.w3c.dom.HTMLElement
import react.*

external object ClearableLabeledInputComponent : Component<ClearableInputProps, State> {
    val Group: GroupComponent
    val Search: SearchComponent
    val TextArea: TextAreaComponent
    val Password: PasswordComponent

    override fun render(): ReactElement?
}

external interface ClearableInputProps : BasicProps, Props {
    var size: SizeType?
    var suffix: ReactNode?
    var prefix: ReactNode?
    var addonBefore: ReactNode?
    var addonAfter: ReactNode?
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
