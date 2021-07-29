package antd.form

import antd.grid.*
import antd.ReactNode
import react.*

external interface FormItemInputComponent : ComponentType<FormItemInputProps>

external interface FormItemInputProps : FormItemInputBaseProps, FormItemInputMiscProps, RProps

external interface FormItemInputBaseProps {
    var wrapperCol: ColProps?
    var help: ReactNode?
    var extra: ReactNode?
    var status: ValidateStatus?
}

external interface FormItemInputMiscProps {
    var prefixCls: String?
    var children: Any /* ReactNode */
    var errors: Array<ReactNode>
    var hasFeedback: Boolean?
    var validateStatus: ValidateStatus?
    var onDomErrorVisibleChange: (visible: Boolean) -> Unit
}
