@file:JsModule("antd/lib/calendar")
@file:JsNonModule

package antd.calendar

import moment.*
import react.*

@JsName("default")
external object CalendarComponent : Component<CalendarProps, CalendarState> {
    override fun render(): ReactElement?
}

external interface CalendarProps : RProps {
    var prefixCls: String?
    var className: String?
    var value: Moment?
    var defaultValue: Moment?
    var mode: CalendarMode?
    var fullscreen: Boolean?
    var dateCellRender: ((date: Moment) -> Any /* String | ReactElement */)?
    var monthCellRender: ((date: Moment) -> Any /* String | ReactElement */)?
    var dateFullCellRender: ((date: Moment) -> Any /* String | ReactElement */)?
    var monthFullCellRender: ((date: Moment) -> Any /* String | ReactElement */)?
    var locale: Any?
    var style: dynamic
    var onPanelChange: ((date: Moment?, mode: CalendarMode?) -> Unit)?
    var onSelect: ((date: Moment?) -> Unit)?
    var onChange: ((date: Moment?) -> Unit)?
    var disabledDate: ((current: Moment) -> Boolean)?
    var validRange: Array<Moment>?
    var headerRender: HeaderRender?
}

external interface CalendarState : RState {
    var value: Moment
    var mode: CalendarMode?
}
