package reactintl

typealias OptionalIntlConfig = IntlConfig
typealias MessageFormatElement = BaseElement<MessageType> /* LiteralElement | ArgumentElement | NumberElement | DateElement | TimeElement | SelectElement | PluralElement | TagElement | PoundElement */
typealias ValidPluralRule = String /* "zero" | "one" | "two" | "few" | "many" | "other" */
typealias Skeleton = Any /* NumberSkeleton | DateTimeSkeleton */
typealias MessageFormatPart<T> = Any /* LiteralPart | ObjectPart<T> */
typealias PrimitiveType = Any? /* String | Number | boolean | Date */
typealias FormatXMLElementFn<T, R> = (parts: Array<Any /* String | T */>) -> R
typealias Part = Any /* LiteralPart | ElementPart */
typealias Locale = String
