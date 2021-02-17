package antd.radio

import antd.*
import antd.checkbox.*
import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

external object RadioGroupComponent : Component<RadioGroupProps, RState> {
    override fun render(): ReactElement?
}

external interface RadioGroupProps : AbstractCheckboxGroupProps, RProps {
    var defaultValue: Any?
    var value: Any?
    var onChange: ((e: RadioChangeEvent) -> Unit)?
    var size: SizeType?
    var onMouseEnter: MouseEventHandler<HTMLDivElement>?
    var onMouseLeave: MouseEventHandler<HTMLDivElement>?
    var name: String?
    var children: Any? /* String | ReactElement */
    var id: String?
    var optionType: RadioGroupOptionType?
    var buttonStyle: RadioGroupButtonStyle?
}
