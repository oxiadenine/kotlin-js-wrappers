@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.message

import react.*
import reactintl.*

@JsName("FormattedMessage")
open external class FormattedMessageComponent : Component<FormattedMessageProps<Any>, RState> {
    override fun render(): ReactElement?
}

external interface FormattedMessageProps<V> : MessageDescriptor, RProps {
    var values: V?
    var tagName: Any?
    var children: ((nodes: Array<Any>) -> ReactElement)?
}

external interface MessageFormatOptions {
    var formatters: Formatters?
    var ignoreTag: Boolean?
}

external class MessageFormat(
    message: Any /* string | Array<MessageFormatElement? */,
    locales: Any? /* String | Array<String> */ = definedExternally,
    overrideFormats: Formats, opts: MessageFormatOptions? = definedExternally) {
    fun <T> format(values: Any? = definedExternally): Any? /* String | T | Array<String | T> */
    fun <T> formatToParts(values: Any? = definedExternally): Array<MessageFormatPart<T>>

    var resolvedOptions: () -> Any
    var getAst: () -> Array<MessageFormatElement>
}

external interface MessageDescriptor {
    var id: Any? /* String | Number */
    var description: Any?
    var defaultMessage: Any? /* String | Array<MessageFormatElement> */
}
