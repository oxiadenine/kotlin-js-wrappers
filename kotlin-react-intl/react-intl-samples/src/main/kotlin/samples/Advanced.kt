package samples

import csstype.px
import emotion.react.css
import kotlinx.js.Record
import react.*
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import react.dom.html.ReactHTML.strong
import reactintl.components.message.FormattedMessage
import reactintl.components.provider.IntlProvider
import kotlin.js.Date
import kotlin.js.json
import kotlin.random.*

private fun loadLocaleData(locale: String): dynamic {
    return when (locale) {
        "fr" -> js("require('./fr.json')")
        "en" -> js("require('./en.json')")
        else -> js("require('./en.json')")
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
        }
    }
}