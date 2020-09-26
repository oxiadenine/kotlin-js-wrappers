package antd.calendar

import moment.*
import react.*

external object HeaderComponent : Component<HeaderProps, RState> {
    override fun render(): ReactElement?
}

external interface HeaderProps : RProps {
    var prefixCls: String?
    var locale: Any?
    var fullscreen: Boolean?
    var yearSelectOffset: Number?
    var yearSelectTotal: Number?
    var type: String?
    var onValueChange: ((value: Moment) -> Unit)?
    var onTypeChange: ((type: String) -> Unit)?
    var value: Moment
    var validRange: Array<Moment>?
    var headerRender: HeaderRender?
}

external interface RenderHeader {
    var value: Moment
    var onChange: ((value: Moment) -> Unit)?
    var type: String
    var onTypeChange: (type: String) -> Unit
}
