@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.list

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("FormattedList")
external class FormattedListComponent : Component<FormattedListProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedListProps : IntlListFormatOptions, RProps {
    var value: Array<ReactElement>
}
