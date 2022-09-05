package samples

import kotlinx.js.Record
import react.*
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.strong
import reactintl.components.message.FormattedMessage
import reactintl.components.provider.IntlProvider
import kotlin.js.Date
import kotlin.js.json
import kotlin.random.*

private val appMessages = json(
    "simple" to "Hello world",
    "placeholder" to "Hello {name}",
    "date" to "Hello {ts, date}",
    "time" to "Hello {ts, time}",
    "number" to "Hello {num, number}",
    "plural" to "I have {num, plural, one {# dog} other {# dogs}}",
    "select" to "I am a {gender, select, male {boy} female {girl} other {}}",
    "selectordinal" to """I am the {order, selectordinal,
        one {#st person}
        two {#nd person}
        =3 {#rd person}
        other {#th person}
    }""".trimIndent(),
    "richtext" to "I have <bold>{num, plural, one {# dog} other {# dogs}}</bold>",
    "richertext" to "I have <bold>{num, plural, one {# & dog} other {# dogs}}</bold>",
    "unicode" to "Hello\u0020{placeholder}"
).unsafeCast<Any>()

val Messages = FC<Props> {
    IntlProvider {
        locale = "en"
        messages = appMessages
        p {
            FormattedMessage { id = "simple" }
            br {}
            FormattedMessage {
                id = "placeholder"
                values = json("name" to "John").unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "date"
                values = json("ts" to Date.now()).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "time"
                values = json("ts" to Date.now()).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "number"
                values = json("num" to Random.nextInt() * 1000).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = json("num" to 1).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = json("num" to 99).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "select"
                values = json("gender" to "male").unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "select"
                values = json("gender" to "female").unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = json("order" to 1).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = json("order" to 2).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = json("order" to 3).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = json("order" to 4).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "richtext"
                values = json(
                    "num" to 99,
                    "bold" to fun(chunks: String): ReactNode {
                        return strong.create { +chunks }
                    }
                ).unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "unicode"
                values = json("placeholder" to "world").unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "whatever"
                defaultMessage = "Hello\u0020{placeholder}"
                values = json("placeholder" to "world").unsafeCast<Record<String, ReactNode>>()
            }
        }
    }
}