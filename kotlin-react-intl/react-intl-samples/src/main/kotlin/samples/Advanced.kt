package samples

import csstype.px
import emotion.react.css
import kotlinext.js.*
import kotlinx.js.Record
import react.*
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.strong
import reactintl.components.message.FormattedMessage
import reactintl.components.provider.IntlProvider
import kotlin.js.Date
import kotlin.random.*

private fun loadLocaleData(locale: String): dynamic {
    return when (locale) {
        "fr" -> require("./fr.json")
        "en" -> require("./en.json")
        else -> require("./en.json")
    }
}

val Advanced = FC<Props> {
    IntlProvider {
        locale = "en"
        defaultLocale = "en"
        messages = loadLocaleData("en").unsafeCast<Any>()
        p {
            span {
                css { fontSize = 30.px }
                +"AST"
            }
            br {}
            FormattedMessage { id = "simple" }
            br {}
            FormattedMessage {
                id = "placeholder"
                values = js { name = "John" }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "date"
                values = js { ts = Date.now() }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "time"
                values = js { ts = Date.now() }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "number"
                values = js { num = Random.nextInt() * 1000 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = js { num = 1 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "plural"
                values = js { num = 99 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "select"
                values = js { gender = "male" }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "select"
                values = js { gender = "female" }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 1 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 2 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 3 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "selectordinal"
                values = js { order = 4 }.unsafeCast<Record<String, ReactNode>>()
            }
            br {}
            FormattedMessage {
                id = "richtext"
                values = js {
                    num = 99
                    bold = fun(chunks: String): ReactNode {
                        return strong.create { +chunks }
                    }
                }.unsafeCast<Record<String, ReactNode>>()
            }
        }
    }
}
