@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.components.message

import kotlinx.js.Record
import react.FC
import react.Props
import react.ReactNode
import reactintl.Formats
import reactintl.Formatters
import reactintl.MessageDescriptor
import reactintl.MessageFormatElement

@JsName("FormattedMessage")
external val FormattedMessage: FC<FormattedMessageProps<Record<String, ReactNode>>>

external interface FormattedMessageProps<V : Record<String, ReactNode>> : MessageDescriptor, Props {
    var values: V?
    var tagName: Any?
    var children: ((nodes: Array<ReactNode>) -> ReactNode)?
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