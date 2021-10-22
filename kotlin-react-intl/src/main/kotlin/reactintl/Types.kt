package reactintl

typealias OnErrorFn = (err: IntlError) -> Unit
typealias MessageFormatElement = BaseElement<MessageType> /* ArgumentElement | DateElement | LiteralElement | NumberElement | PluralElement | PoundElement | SelectElement | TagElement | TimeElement */
typealias Skeleton = Any /* NumberSkeleton | DateTimeSkeleton */
typealias FormatXMLElementFn<T, R> = (parts: Array<Any /* String | T */>) -> R
typealias Locale = String
