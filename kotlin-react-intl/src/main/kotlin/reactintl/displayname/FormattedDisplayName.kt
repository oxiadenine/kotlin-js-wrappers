@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.displayname

import react.*

@JsName("FormattedDisplayName")
external class FormattedDisplayNameComponent : Component<FormattedDisplayNameProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedDisplayNameProps : IntlDisplayNameFormatOptions, RProps {
    var value: Any /* String | Number */
}
