package samples

import kotlinext.js.*
import react.*
import react.dom.*
import reactintl.*
import reactintl.provider.*
import kotlin.js.Date
import kotlin.random.*

private val providerMessages = js {
    simple = "Hello world"
    placeholder = "Hello {name}"
    date = "Hello {ts, date}"
    time = "Hello {ts, time}"
    number = "Hello {num, number}"
    plural = "I have {num, plural, one {# dog} other {# dogs}}"
    select = "I am a {gender, select, male {boy} female {girl}}"
    selectordinal = """I am the {order, selectordinal,
        one {#st person}
        two {#nd person}
        =3 {#rd person}
        other {#th person}
    }""".trimIndent()
    richtext = "I have <bold>{num, plural, one {# dog} other {# dogs}}</bold>"
    richertext = "I have <bold>{num, plural, one {# & dog} other {# dogs}}</bold>"
    unicode = "Hello\u0020{placeholder}"
}.unsafeCast<Any>()

private val app = functionalComponent<RProps> {
    val intl = useIntl()

    p {
        +intl.formatMessage(jsObject { id = "simple" })
        br {}
        +intl.formatMessage(jsObject { id = "placeholder" }, js { name = "John" }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "date" }, js { ts = Date.now() }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "time" }, js { ts = Date.now() }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "number" }, js { num = Random.nextInt() * 1000 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "plural" }, js { num = 1 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "plural" }, js { num = 99 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "select" }, js { gender = "male" }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "select" }, js { gender = "female" }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 1 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 2 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 3 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 4 }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject { id = "unicode" }, js { placeholder = "world" }.unsafeCast<Any>())
        br {}
        +intl.formatMessage(jsObject {
            id = "whatever"
            defaultMessage = "Hello\u0020{placeholder}"
        }, js { placeholder = "world" }.unsafeCast<Any>())
    }
}

fun RBuilder.hooks() {
    intlProvider {
        attrs {
            locale = "en"
            messages = providerMessages
        }
        child(app)
    }
}
