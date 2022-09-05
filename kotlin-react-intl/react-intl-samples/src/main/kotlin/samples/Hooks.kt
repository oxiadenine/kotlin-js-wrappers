package samples

import kotlinx.js.Record
import kotlinx.js.jso
import react.*
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import reactintl.components.provider.IntlProvider
import reactintl.components.useIntl
import kotlin.js.Date
import kotlin.js.json
import kotlin.random.*

private val providerMessages = json(
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

private external interface DemoProps : Props {
    var currentTime: Date
}

private val Demo = FC<DemoProps> {
    val intl = useIntl()

    p {
        +intl.formatMessage(jso { id = "simple" })
        br {}
        +intl.formatMessage(jso { id = "placeholder" }, json("name" to "John").unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "date" }, json("ta" to Date.now()).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "time" }, json("ta" to Date.now()).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "number" }, json("num" to Random.nextInt() * 1000).unsafeCast<Record<String,
                Any>>())
        br {}
        +intl.formatMessage(jso { id = "plural" }, json("num" to 1).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "plural" }, json("num" to 99).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "select" }, json("gender" to "male").unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "select" }, json("gender" to "female").unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "selectordinal" }, json("order" to 1).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "selectordinal" }, json("order" to 2).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "selectordinal" }, json("order" to 3).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "selectordinal" }, json("order" to 4).unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso { id = "unicode" }, json("placeholder" to "world").unsafeCast<Record<String, Any>>())
        br {}
        +intl.formatMessage(jso {
            id = "whatever"
            defaultMessage = "Hello\u0020{placeholder}"
        }, json("placeholder" to "world").unsafeCast<Record<String, Any>>())
    }
}

val Hooks = FC<Props> {
    IntlProvider {
        locale = "en"
        messages = providerMessages
        Demo { currentTime = Date() }
    }
}