package antd.form

import antd.grid.ColProps
import react.*

external object FormItemComponent : Component<FormItemProps, RState> {
    override fun render(): ReactElement?
}

external interface FormItemProps : RProps {
    var prefixCls: String?
    var className: String?
    var id: String?
    var htmlFor: String?
    var label: Any? /* String | ReactElement */
    var labelAlign: FormLabelAlign?
    var labelCol: ColProps?
    var wrapperCol: ColProps?
    var help: Any? /* String | ReactElement */
    var extra: Any? /* String | ReactElement */
    var validateStatus: FormItemValidateStatus?
    var hasFeedback: Boolean?
    var required: Boolean?
    var style: dynamic
    var colon: Boolean?
}

external interface FormItemContext {
    var vertical: Boolean
}
