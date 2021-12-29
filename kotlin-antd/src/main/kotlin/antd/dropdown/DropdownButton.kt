package antd.dropdown

import antd.*
import antd.ReactNode
import antd.button.*
import org.w3c.dom.*
import react.*

external interface DropdownButtonComponent : ComponentClass<DropdownButtonProps>

external interface DropdownButtonProps : ButtonGroupProps, DropdownProps {
    var type: DropdownButtonType?
    var htmlType: ButtonHTMLType?
    override var disabled: Boolean?
    var onClick: MouseEventHandler<HTMLButtonElement>?
    var icon: ReactNode?
    var href: String?
    var children: ReactNode?
    var title: String?
    var buttonsRender: ((buttons: Array<ReactNode>) -> Array<ReactNode>)?
}
