package antd.form

import antd.grid.*
import react.*

external interface FormProvider: RClass<FormProviderProps>

external interface FormProviderProps : RProps {
    var validateMessages: ValidateMessages?
}

external val formContext: RContext<FormContextProps>
external val formItemContext: RContext<FormItemContextProps>

external interface FormContextProps {
    var vertical: Boolean
    var name: String?
    var colon: Boolean?
    var labelAlign: FormLabelAlign?
    var labelCol: ColProps?
    var wrapperCol: ColProps?
    var requiredMark: RequiredMark?
    var itemRef: (name: Array<Any /* String | Number */>) -> (node: ReactElement) -> Unit
}

external interface FormItemContextProps {
    var updateItemErrors: (name: String, errors: Array<String>) -> Unit
}

external interface FormItemPrefixContextProps {
    var prefixCls: String
    var status: ValidateStatus?
}
