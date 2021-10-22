package samples

import kotlinext.js.*
import react.*
import react.dom.*
import reactintl.components.provider.intlProvider
import reactintl.components.useIntl
import kotlin.js.Date
import kotlin.random.*

private val providerMessages = js {
    simple = "Hello world"
    placeholder = "Hello {name}"
    date = "Hello {ts, date}"
    time = "Hello {ts, time}"
    number = "Hello {num, number}"
    plural = "I have {num, plural, one {# dog} other {# dogs}}"
    select = "I am a {gender, select, male {boy} female {girl} other {}}"
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

private val app = fc<Props> {
    val intl = useIntl()

    p {
        +intl.formatMessage(jsObject { id = "simple" })
        br {}
        +intl.formatMessage(jsObject { id = "placeholder" }, js { name = "John" })
        br {}
        +intl.formatMessage(jsObject { id = "date" }, js { ts = Date.now() })
        br {}
        +intl.formatMessage(jsObject { id = "time" }, js { ts = Date.now() })
        br {}
        +intl.formatMessage(jsObject { id = "number" }, js { num = Random.nextInt() * 1000 })
        br {}
        +intl.formatMessage(jsObject { id = "plural" }, js { num = 1 })
        br {}
        +intl.formatMessage(jsObject { id = "plural" }, js { num = 99 })
        br {}
        +intl.formatMessage(jsObject { id = "select" }, js { gender = "male" })
        br {}
        +intl.formatMessage(jsObject { id = "select" }, js { gender = "female" })
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 1 })
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 2 })
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 3 })
        br {}
        +intl.formatMessage(jsObject { id = "selectordinal" }, js { order = 4 })
        br {}
        +intl.formatMessage(jsObject { id = "unicode" }, js { placeholder = "world" })
        br {}
        +intl.formatMessage(jsObject {
            id = "whatever"
            defaultMessage = "Hello\u0020{placeholder}"
        }, js { placeholder = "world" })
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
