package samples

import kotlinext.js.*
import react.*
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.strong
import reactintl.components.message.FormattedMessage
import reactintl.components.provider.IntlProvider
import kotlin.js.Date
import kotlin.random.*

private val appMessages = js {
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

val Messages = FC<Props> {
    IntlProvider {
        locale = "en"
        messages = appMessages
        p {
            FormattedMessage { id = "simple" }
            br {}
            FormattedMessage {
                id = "placeholder"
                values = js { name = "John" }
            }
            br {}
            FormattedMessage {
                id = "date"
                values = js { ts = Date.now() }
            }
            br {}
            FormattedMessage {
                id = "time"
                values = js { ts = Date.now() }
            }
            br {}
            FormattedMessage {
                id = "number"
                values = js { num = Random.nextInt() * 1000 }
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = js { num = 1 }
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = js { num = 99 }
            }
            br {}
            FormattedMessage {
                id = "select"
                values = js { gender = "male" }
            }
            br {}
            FormattedMessage {
                id = "select"
                values = js { gender = "female" }
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 1 }
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 2 }
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 3 }
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 4 }
            }
            br {}
            FormattedMessage {
                id = "richtext"
                values = js {
                    num = 99
                    bold = fun(chunks: String): ReactElement {
                        return strong.create { +chunks }
                    }
                }
            }
            br {}
            FormattedMessage {
                id = "richertext"
                values = js {
                    num = 99
                    bold = fun(chunks: String): ReactElement {
                        return strong.create { +chunks }
                    }
                }
            }
            br {}
            FormattedMessage {
                id = "unicode"
                values = js { this.placeholder = "world" }
            }
            br {}
            FormattedMessage {
                id = "whatever"
                defaultMessage = "Hello\u0020{placeholder}"
                values = js { this.placeholder = "world" }
            }
        }
    }
}
