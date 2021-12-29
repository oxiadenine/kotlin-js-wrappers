package antd.typography

import antd.AnchorHTMLAttributes
import antd.RefAttributes
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLElement
import react.*

external interface LinkComponent : ComponentClass<LinkProps>

external interface LinkProps : BlockProps, AnchorHTMLAttributes<HTMLAnchorElement>, RefAttributes<HTMLElement>, Props {
    override var ellipsis: dynamic /* Boolean */
}
