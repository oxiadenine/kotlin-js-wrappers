@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.plural

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.FormatPluralOptions
import reactintl.IntlShape

@JsName("FormattedPlural")
external class FormattedPluralComponent : Component<FormattedPluralProps, RState> {
    override fun render(): ReactElement?
}

external interface FormattedPluralProps : FormatPluralOptions, RProps {
    var value: Number
    var intl: IntlShape
    var other: Any /* String | ReactElement */
    var zero: Any? /* String | ReactElement */
    var one: Any? /* String | ReactElement */
    var two: Any? /* String | ReactElement */
    var few: Any? /* String | ReactElement */
    var many: Any? /* String | ReactElement */
    var children: ((value: ReactElement) -> ReactElement)?
}
