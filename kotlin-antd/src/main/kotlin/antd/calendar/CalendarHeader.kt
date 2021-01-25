package antd.calendar

import react.*

external class CalendarHeaderComponent<DateType> : Component<CalendarHeaderProps<DateType>, RState> {
    override fun render(): ReactElement?
}

external interface CalendarHeaderProps<DateType> : RProps {
    var prefixCls: String
    var value: DateType
    var validRange: Array<DateType>?
    var generateConfig: GenerateConfig<DateType>
    var locale: Locale
    var mode: CalendarMode
    var fullscreen: Boolean
    var onChange: (date: DateType) -> Unit
    var onModeChange: (mode: CalendarMode) -> Unit
}
