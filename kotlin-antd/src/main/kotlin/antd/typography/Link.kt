package antd.typography

import antd.AnchorHTMLAttributes
import org.w3c.dom.HTMLAnchorElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object LinkComponent : Component<LinkProps, RState> {
    override fun render(): ReactElement?
}

external interface LinkProps : BlockProps, AnchorHTMLAttributes<HTMLAnchorElement>, RProps {
    override var ellipsis: dynamic /* Boolean */
}
