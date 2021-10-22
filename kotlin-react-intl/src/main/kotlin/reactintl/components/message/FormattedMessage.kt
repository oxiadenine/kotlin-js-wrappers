@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.message

import kotlinext.js.Record
import react.*
import reactintl.*

@JsName("FormattedMessage")
external class FormattedMessageComponent :
    Component<FormattedMessageProps<Record<String, Any /* String | ReactNode */>>, State> {
    override fun render(): ReactElement?
}

external interface FormattedMessageProps<V : Record<String, Any /* String | ReactNode */>> : MessageDescriptor, Props {
    var values: V?
    var tagName: Any?
    var children: ((nodes: Array<Any /* String | ReactNode */>) -> ReactElement)?
    var ignoreTag: Boolean?
}

external interface MessageFormatOptions {
    var formatters: Formatters?
    var ignoreTag: Boolean?
}

external class MessageFormat(
    message: Any /* String | Array<MessageFormatElement> */,
    locales: Any? /* String | Array<String> */,
    overrideFormats: Formats?,
    opts: MessageFormatOptions?
) {
    fun <T> format(values: Record<String, Any /* PrimitiveType | T | FormatXMLElementFn<T, Any /* String | T | Array<Any /* String | T */> */> */>?): Any /* String | T | Array< Any /* String | T */> */
    fun <T> formatToParts(values: Record<String, Any /* PrimitiveType | T | FormatXMLElementFn<T, Any /* String | T | Array<Any /* String | T */> */> */>?): Array<MessageFormatPart<T>>

    val resolvedOptions: () -> ResolvedOptions
    val getAst: () -> Array<MessageFormatElement>

    interface ResolvedOptions {
        var locale: String
    }
}
