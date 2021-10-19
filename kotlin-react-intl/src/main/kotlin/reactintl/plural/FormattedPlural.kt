@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.plural

import react.*
import reactintl.*

@JsName("FormattedPlural")
external class FormattedPluralComponent :
    Component<WithIntlProps<FormattedPluralProps>, State>,
    FormattedPluralWrappedComponent {
    override var WrappedComponent: ComponentClass<FormattedPluralProps>

    override fun render(): ReactElement?
}

external interface FormattedPluralWrappedComponent {
    var WrappedComponent: ComponentClass<FormattedPluralProps>
}

external interface FormattedPluralProps : IntlPluralFormatOptions, CustomFormatConfig, Props {
    var value: Number
    var intl: IntlShape
    var other: Any /* String | ReactElement */
    var zero: Any? /* String | ReactElement */
    var one: Any? /* String | ReactElement */
    var two: Any? /* String | ReactElement */
    var few: Any? /* String | ReactElement */
    var many: Any? /* String | ReactElement */
    var children: ((value: ReactElement) -> ReactElement?)?
}

external interface PluralOrSelectOption {
    var value: Array<MessageFormatElement>
    var location: Location?
}
