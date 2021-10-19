package antd.anchor

import antd.ReactNode
import react.*

external interface AnchorLinkComponent : ComponentType<AnchorLinkProps>

external interface AnchorLinkProps : Props {
    var prefixCls: String?
    var href: String
    var title: ReactNode
    var children: ReactNode?
    var className: String?
}
