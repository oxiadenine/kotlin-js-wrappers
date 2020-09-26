@file:JsModule("react-intl")
@file:JsNonModule

package reactintl

import react.*

external val DEFAULT_INTL_CONFIG: IntlConfig

external fun invariantIntlContext(intl: Any? = definedExternally): Boolean
external fun assignUniqueKeysToParts(formatXMLElementFn: FormatXMLElementFn<ReactElement, Any>): FormatXMLElementFn<ReactElement, Any>
