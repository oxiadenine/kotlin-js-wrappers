package antd.form

import antd.ReactNode
import antd.grid.*
import react.*

external object FormItemInputComponent : Component<FormItemInputProps, RState> {
    override fun render(): ReactElement?
}

external interface FormItemInputProps : FormItemInputBaseProps, FormItemInputMiscProps, RProps

external interface FormItemInputBaseProps {
    var wrapperCol: ColProps?
    var help: ReactNode?
    var extra: ReactNode?
    var status: ValidateStatus?
}

external interface FormItemInputMiscProps {
    var prefixCls: String?
    var children: ReactNode
    var errors: Array<ReactNode>
    var hasFeedback: Boolean?
    var validateStatus: ValidateStatus?
    var onDomErrorVisibleChange: (visible: Boolean) -> Unit
}
