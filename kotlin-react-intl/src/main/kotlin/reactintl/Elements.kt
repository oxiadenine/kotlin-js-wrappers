package reactintl

import reactintl.components.datetime.IntlDateTime
import reactintl.components.number.IntlNumber
import reactintl.components.plural.IntlPluralRuleType

external enum class MessageType {
    LITERAL,
    ARGUMENT,
    NUMBER,
    DATE,
    TIME,
    SELECT,
    PLURAL,
    POUND,
    TAG
}

external enum class MessageSkeletonType {
    NUMBER,
    DATE_TIME
}

external interface BaseElement<T : MessageType> {
    var type: T
    var value: String
    var location: Location?
}

external interface LiteralElement : BaseElement<MessageType>
external interface ArgumentElement : BaseElement<MessageType>

external interface TagElement : BaseElement<MessageType> {
    var children: Array<MessageFormatElement>
}

external interface SimpleFormatElement<T : MessageType, S : Skeleton> : BaseElement<T> {
    var style: Any? /* String | S */
}

external interface NumberElement : SimpleFormatElement<MessageType, NumberSkeleton>
external interface DateElement : SimpleFormatElement<MessageType, DateTimeSkeleton>
external interface TimeElement : SimpleFormatElement<MessageType, DateTimeSkeleton>

external interface SelectElement : BaseElement<MessageType> {
    var options: Any
}

external interface PluralElement : BaseElement<MessageType> {
    var options: Any
    var offset: Number
    var pluralType: IntlPluralRuleType
}

external interface PoundElement : BaseElement<MessageType>

external interface DateTimeSkeleton {
    var type: MessageSkeletonType
    var pattern: String
    var location: Location?
    var parsedOptions: IntlDateTime.DateTimeFormatOptions
}

external interface NumberSkeleton {
    var type: MessageSkeletonType
    var tokens: Array<NumberSkeletonToken>
    var location: Location?
    var parsedOptions: IntlNumber.NumberFormatOptions
}

external interface NumberSkeletonToken {
    var stem: String
    var options: Array<String>
}