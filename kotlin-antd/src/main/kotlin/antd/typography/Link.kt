package antd.typography

import antd.AnchorHTMLAttributes
import antd.RefAttributes
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLElement
import react.*

external interface LinkComponent : ComponentType<LinkProps>

external interface LinkProps : BlockProps, AnchorHTMLAttributes<HTMLAnchorElement>, RefAttributes<HTMLElement>, RProps {
    override var ellipsis: dynamic /* Boolean */
}
