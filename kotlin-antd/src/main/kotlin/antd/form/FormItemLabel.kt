package antd.form

import antd.grid.*
import antd.ReactNode
import antd.tooltip.*
import react.*

external interface FormItemLabelComponent : ComponentType<FormItemLabelProps>

external interface FormItemLabelProps : FormItemLabelBaseProps, FormItemLabelMiscProps, RProps

external interface FormItemLabelBaseProps {
    var wrapperCol: ColProps?
    var colon: Boolean?
    var htmlFor: String?
    var label: ReactNode?
    var labelAlign: FormLabelAlign?
    var labelCol: ColProps?
    var requiredMark: RequiredMark?
    var tooltip: LabelTooltipType?
}

external interface FormItemLabelMiscProps {
    var required: Boolean?
    var prefixCls: String?
}

external interface WrapperTooltipProps : TooltipProps {
    var icon: ReactElement?
}
