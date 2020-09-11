@file:JsModule("react-intl")
@file:JsNonModule

package reactintl.message

import react.Component
import react.RProps
import react.RState
import react.ReactElement
import reactintl.*
import reactintl.Formats
import reactintl.Formatters

@JsName("FormattedMessage")
open external class FormattedMessageComponent : Component<FormattedMessageProps<Any>, RState> {
    override fun render(): ReactElement?
}

external interface FormattedMessageProps<V> : MessageDescriptor, RProps {
    var values: V?
        get() = definedExternally
        set(value) = definedExternally
    var tagName: Any?
        get() = definedExternally
        set(value) = definedExternally
    var children: ((nodes: Array<Any>) -> ReactElement)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MessageFormatOptions {
    var formatters: Formatters?
        get() = definedExternally
        set(value) = definedExternally
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
        get() = definedExternally
        set(value) = definedExternally
    var description: Any?
        get() = definedExternally
        set(value) = definedExternally
    var defaultMessage: Any? /* String | Array<MessageFormatElement> */
        get() = definedExternally
        set(value) = definedExternally
}
