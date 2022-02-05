package samples

import csstype.px
import kotlinext.js.*
import react.*
import react.css.css
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
        }
    }
}
