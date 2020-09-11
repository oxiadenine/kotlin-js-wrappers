@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.plural

import react.*
import reactintl.*

@JsName("FormattedPlural")
external class FormattedPluralComponent :
    Component<WithIntlProps<FormattedPluralProps>, RState>,
    FormattedPluralWrappedComponent {
    override var WrappedComponent: RClass<FormattedPluralProps>

    override fun render(): ReactElement?
}

external interface FormattedPluralWrappedComponent {
    var WrappedComponent: RClass<FormattedPluralProps>
}

external interface FormattedPluralProps : IntlPluralFormatOptions, CustomFormatConfig, RProps {
    var value: Number
    var intl: IntlShape
    var other: Any /* String | ReactElement */
    var zero: Any? /* String | ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var one: Any? /* String | ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var two: Any? /* String | ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var few: Any? /* String | ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var many: Any? /* String | ReactElement */
        get() = definedExternally
        set(value) = definedExternally
    var children: ((value: ReactElement) -> ReactElement?)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PluralOrSelectOption {
    var value: Array<MessageFormatElement>
    var location: Location?
        get() = definedExternally
        set(value) = definedExternally
}
