package antd.card

import antd.ReactNode
import react.*

external interface CardMetaComponent : ComponentType<CardMetaProps>

external interface CardMetaProps : RProps {
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var avatar: ReactNode?
    var title: ReactNode?
    var description: ReactNode?
}
