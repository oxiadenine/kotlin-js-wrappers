package antd.radio

import antd.RefAttributes
import antd.checkbox.*
import react.*

external interface RadioButtonComponent : ComponentClass<RadioButtonProps>

external interface RadioButtonProps : AbstractCheckboxProps<RadioChangeEvent>, RefAttributes<Any>, Props
