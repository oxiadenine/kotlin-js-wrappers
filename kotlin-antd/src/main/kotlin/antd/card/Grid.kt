package antd.card

import react.*

external interface CardGridComponent : ComponentType<CardGridProps>

external interface CardGridProps : Props {
    var prefixCls: String?
    var className: String?
    var hoverable: Boolean?
    var style: dynamic
}
