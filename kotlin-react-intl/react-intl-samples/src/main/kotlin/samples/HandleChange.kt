package samples

import kotlinext.js.Object
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.browser.document
import kotlinx.html.id
import kotlinx.html.js.onChangeFunction
import react.*
import react.dom.*
import reactintl.IntlShape
import reactintl.createIntl
import reactintl.createIntlCache
import reactintl.rawIntlProvider

private val intlMessages = run {
    val messages = js {}

    messages["en-US"] = js { selectlanguage = "Select a language" }
    messages["pt-BR"] = js { selectlanguage = "Selecione uma linguagem" }

    messages
}.unsafeCast<Any>()


private const val initialLocale = "en-US"
private val cache = createIntlCache()

var intl = createIntl(jsObject {
    locale = initialLocale
    messages = intlMessages.asDynamic()[initialLocale].unsafeCast<Any>()
}, cache)

private val app = functionalComponent<RProps> {
    val (language, setLanguage) = useState(initialLocale)

    val changeLanguage = fun (newLocale: String) {
        intl = createIntl(jsObject {
            locale = newLocale
            messages = intlMessages.asDynamic()[newLocale].unsafeCast<Any>()
        }, cache)

        document.documentElement.asDynamic()["lang"] = newLocale

        setLanguage(newLocale)
    }

    rawIntlProvider {
        attrs.value = intl
        h1 { +intl.formatMessage(jsObject { id = "selectlanguage" }) }
        select {
            attrs {
                id = "locale"
                name = "locale"
                value = language
                onChangeFunction = {
                    changeLanguage(it.target.asDynamic().value as String)
                }
            }
            Object.keys(intlMessages).map { locale ->
                option {
                    attrs {
                        key = locale
                        value = locale
                    }
                    +locale
                }
            }.toTypedArray()
        }
    }
}

fun RBuilder.handleChange() = child(app)
