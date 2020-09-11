@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.displayname

import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("FormattedDisplayName")
external class FormattedDisplayNameComponent : Component<FormattedDisplayNameProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedDisplayNameProps : IntlDisplayNameFormatOptions, RProps {
    var value: Any /* String | Number */
}
