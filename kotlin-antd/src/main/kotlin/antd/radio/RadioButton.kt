package antd.radio

import antd.checkbox.AbstractCheckboxProps
import react.Component
import react.*

external object RadioButtonComponent : Component<RadioButtonProps, RState> {
    override fun render(): ReactElement?
}

external interface RadioButtonProps : AbstractCheckboxProps<RadioChangeEvent>, RProps
