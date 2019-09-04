package antd.anchor

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object AnchorLinkComponent : Component<AnchorLinkProps, RState> {
    override fun render(): ReactElement?
}

external interface AnchorLinkProps : RProps {
    var prefixCls: String?
    var href: String
    var title: Any /* String | ReactElement */
    var children: ReactElement?
    var className: String?
}
