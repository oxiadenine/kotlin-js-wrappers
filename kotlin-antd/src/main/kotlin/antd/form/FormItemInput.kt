package antd.form

import antd.grid.*
import react.*

external object FormItemInputComponent : Component<FormItemInputProps, RState> {
    override fun render(): ReactElement?
}

external interface FormItemInputProps : FormItemInputBaseProps, FormItemInputMiscProps, RProps

external interface FormItemInputBaseProps {
    var wrapperCol: ColProps?
    var help: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement */
    var status: ValidateStatus?
}

external interface FormItemInputMiscProps {
    var prefixCls: String?
    var children: Any
    var errors: Array<ReactElement>
    var hasFeedback: Boolean?
    var validateStatus: ValidateStatus?
    var onDomErrorVisibleChange: (visible: Boolean) -> Unit
}
