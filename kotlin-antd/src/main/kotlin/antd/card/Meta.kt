package antd.card

import antd.ReactNode
import react.*

external interface CardMetaComponent : ComponentClass<CardMetaProps>

external interface CardMetaProps : Props {
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var avatar: ReactNode?
    var title: ReactNode?
    var description: ReactNode?
}
