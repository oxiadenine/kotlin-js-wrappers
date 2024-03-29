package antd.menu

import antd.ReactNode
import org.w3c.dom.events.*
import react.*

external interface SubMenuComponent : ComponentClass<SubMenuProps>

external interface SubMenuProps : Props {
    var rootPrefixCls: String?
    var className: String?
    var disabled: Boolean?
    var level: Number?
    var title: ReactNode?
    var icon: ReactNode?
    var style: dynamic
    var onTitleClick: ((e: TitleEventEntity) -> Unit)?
    var onTitleMouseEnter: ((e: TitleEventEntity) -> Unit)?
    var onTitleMouseLeave: ((e: TitleEventEntity) -> Unit)?
    var popupOffset: Array<Number>?
    var popupClassName: String?
}

external interface TitleEventEntity {
    var key: String
    var domEvent: Event
}
