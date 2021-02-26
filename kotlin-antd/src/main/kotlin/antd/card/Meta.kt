package antd.card

import antd.ReactNode
import react.*

external object CardMetaComponent : Component<CardMetaProps, RState> {
    override fun render(): ReactElement?
}

external interface CardMetaProps : RProps {
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var avatar: ReactNode?
    var title: ReactNode?
    var description: ReactNode?
}
