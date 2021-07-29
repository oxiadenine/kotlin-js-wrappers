package antd.radio

import antd.*
import antd.ReactNode
import antd.checkbox.*
import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

external interface RadioGroupComponent : ComponentType<RadioGroupProps>

external interface RadioGroupProps : AbstractCheckboxGroupProps, RefAttributes<HTMLDivElement>, RProps {
    var defaultValue: Any?
    var value: Any?
    var onChange: ((e: RadioChangeEvent) -> Unit)?
    var size: SizeType?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var name: String?
    var children: ReactNode?
    var id: String?
    var optionType: RadioGroupOptionType?
    var buttonStyle: RadioGroupButtonStyle?
}
