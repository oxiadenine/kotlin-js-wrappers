package samples

import kotlinext.js.*
import kotlinx.browser.*
import kotlinx.js.Object
import kotlinx.js.jso
import react.*
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.option
import react.dom.html.ReactHTML.select
import reactintl.*
import reactintl.components.provider.createIntl
import reactintl.components.RawIntlProvider

private val appMessages = run {
    val messages = js {}

    messages["en-US"] = js { selectlanguage = "Select a language" }
    messages["pt-BR"] = js { selectlanguage = "Selecione uma linguagem" }

    messages
}.unsafeCast<Any>()


private const val initialLocale = "en-US"
private val cache = createIntlCache()

var intl = createIntl(jso {
    locale = initialLocale
    messages = appMessages.asDynamic()[initialLocale].unsafeCast<Any>()
}, cache)

val HandleChange = FC<Props> {
    val (language, setLanguage) = useState(initialLocale)

    val changeLanguage = fun(newLocale: String) {
        intl = createIntl(jso {
            locale = newLocale
            messages = appMessages.asDynamic()[newLocale].unsafeCast<Any>()
        }, cache)

        document.documentElement.asDynamic()["lang"] = newLocale

        setLanguage(newLocale)
    }

    RawIntlProvider {
        value = intl
        h1 { +intl.formatMessage(jso { id = "selectlanguage" }) }
        select {
            id = "locale"
            name = "locale"
            defaultValue = language
            onChange = { event ->
                changeLanguage(event.target.asDynamic().value as String)
            }
            Object.keys(appMessages).map { locale ->
                option {
                    key = locale
                    value = locale
                    +locale
                }
            }.toTypedArray()
        }
    }
}