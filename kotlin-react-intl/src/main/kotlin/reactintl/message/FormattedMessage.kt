@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.message

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.MessageDescriptor

@JsName("FormattedMessage")
open external class FormattedMessageComponent<V /* V extends Record<string, any> = Record<string, PrimitiveType | React.ReactElement | FormatXMLElementFn> */> : Component<FormattedMessageProps<Any>, RState> /* React.Component<Props<V>> */ {
    override fun render(): ReactElement?
}

@JsName("FormattedHTMLMessage")
external class FormattedHTMLMessageComponent : FormattedMessageComponent<Any /* Record<string, PrimitiveType> */> {
    override fun render(): ReactElement?
}

external interface FormattedMessageProps<V /* V extends Record<string, any> = Record<string, React.ReactNode> */> : MessageDescriptor, RProps {
    var values: V?
    var tagName: Any? /* React.ElementType<any> */
    var children: ((formattedMessage: Array<Any> /* React.ReactNodeArray */) -> ReactElement)?
}
