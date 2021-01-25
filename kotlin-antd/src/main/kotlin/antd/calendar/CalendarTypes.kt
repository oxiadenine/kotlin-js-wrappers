package antd.calendar

typealias CalendarMode = String /* "year" | "month" */
typealias HeaderRender<DateType> = (config: HeaderRenderConfig<DateType>) -> Any /* String | ReactElement */
