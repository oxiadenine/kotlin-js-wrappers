package antd.dropdown

import antd.MouseEventHandler
import antd.button.ButtonGroupProps
import antd.button.ButtonHTMLType
import org.w3c.dom.HTMLButtonElement
import react.*

external object DropdownButtonComponent : Component<DropdownButtonProps, RState> {
    override fun render(): ReactElement?
}

external interface DropdownButtonProps : ButtonGroupProps, DropdownProps {
    var type: DropdownButtonType?
    var htmlType: ButtonHTMLType?
    override var disabled: Boolean?
    var onClick: MouseEventHandler<HTMLButtonElement>?
    var icon: ReactElement?
    var href: String?
    var children: ReactElement?
}
