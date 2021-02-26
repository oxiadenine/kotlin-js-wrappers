package antd.anchor

import antd.ReactNode
import react.*

external object AnchorLinkComponent : Component<AnchorLinkProps, RState> {
    override fun render(): ReactElement?
}

external interface AnchorLinkProps : RProps {
    var prefixCls: String?
    var href: String
    var title: ReactNode
    var children: ReactNode?
    var className: String?
}
