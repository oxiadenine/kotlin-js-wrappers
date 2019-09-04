package antd.checkbox

import react.*

external object CheckboxGroupComponent : Component<CheckboxGroupProps, CheckboxGroupState> {
    override fun render(): ReactElement?
}

external interface CheckboxGroupProps : AbstractCheckboxGroupProps, RProps {
    var name: String?
    var defaultValue: Array<CheckboxValueType>?
    var value: Array<CheckboxValueType>?
    var onChange: ((checkedValue: Array<CheckboxValueType>) -> Unit)?
}

external interface CheckboxGroupState : RState {
    var value: Array<CheckboxValueType>
    var registeredValues: Array<CheckboxValueType>
}

external interface AbstractCheckboxGroupProps {
    var prefixCls: String?
    var className: String?
    var options: Array<Any /* CheckboxOptionType | String */>?
    var disabled: Boolean?
    var style: dynamic
}

external interface CheckboxOptionType {
    var label: Any /* String | ReactElement */
    var value: CheckboxValueType
    var disabled: Boolean?
    var onChange: ((e: CheckboxChangeEvent) -> Unit)?
}
