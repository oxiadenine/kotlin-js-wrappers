package antd.typography

import antd.AnchorHTMLAttributes
import antd.RefAttributes
import org.w3c.dom.HTMLAnchorElement
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object LinkComponent : Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

external interface LinkProps : BlockProps, AnchorHTMLAttributes<HTMLAnchorElement>, RefAttributes<HTMLElement>, RProps {
    override var ellipsis: dynamic /* Boolean */
}
