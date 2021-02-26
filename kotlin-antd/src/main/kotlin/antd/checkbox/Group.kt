package antd.checkbox

import antd.ReactNode
import react.*

external object CheckboxGroupComponent : Component<CheckboxGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface CheckboxGroupProps : AbstractCheckboxGroupProps, RProps {
    var name: String?
    var defaultValue: Array<CheckboxValueType>?
    var value: Array<CheckboxValueType>?
    var onChange: ((checkedValue: Array<CheckboxValueType>) -> Unit)?
    var children: ReactNode?
}

external interface AbstractCheckboxGroupProps {
    var prefixCls: String?
    var className: String?
    var options: Array<Any /* CheckboxOptionType | String */>?
    var disabled: Boolean?
    var style: dynamic
}

external interface CheckboxOptionType {
    var label: ReactNode
    var value: CheckboxValueType
    var disabled: Boolean?
    var onChange: ((e: CheckboxChangeEvent) -> Unit)?
}

external val groupContext: RContext<CheckboxGroupContext?>

external interface CheckboxGroupContext {
    var name: String?
    var toggleOption: ((option: CheckboxOptionType) -> Unit)?
    var value: Any?
    var disabled: Boolean?
    var registerValue: (value: String) -> Unit
    var cancelValue: (value: String) -> Unit
}
