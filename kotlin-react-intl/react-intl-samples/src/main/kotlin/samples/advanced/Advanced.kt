package samples.advanced

import kotlinext.js.js
import kotlinext.js.require
import react.*
import react.dom.*
import reactintl.message.formattedMessage
import reactintl.provider.intlProvider
import kotlin.js.Date
import kotlin.random.Random

private fun loadLocaleData(locale: String): Any {
    val advancedDir = "../../../../../kotlin-react-intl/react-intl-samples/src/main/kotlin/samples/advanced"

    return when (locale) {
        "fr" -> require("$advancedDir/fr.json")
        "en" -> require("$advancedDir/en.json")
        else -> require("$advancedDir/en.json")
    }.unsafeCast<Any>()
}

interface AdvancedProps : RProps {
    var locale: String
    var messages: Any
}

private val app = functionalComponent<AdvancedProps> { props ->
    intlProvider {
        attrs {
            locale = props.locale
            defaultLocale = "en"
            messages = props.messages
        }
        p {
            span {
                attrs.jsStyle = js {fontSize = "30px"}
                +"AST"
            }
            br {}
            formattedMessage { attrs.id = "simple" }
            br {}
            formattedMessage {
                attrs {
                    id = "placeholder"
                    values = js { name = "John" }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "date"
                    values = js { ts = Date.now() }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "time"
                    values = js { ts = Date.now() }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "number"
                    values = js { num = Random.nextInt() * 1000 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "plural"
                    values = js { num = 1 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "plural"
                    values = js { num = 99 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "select"
                    values = js { gender = "male" }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "select"
                    values = js { gender = "female" }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 1 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 2 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 3 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 4 }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "richtext"
                    values = js {
                        num = 99
                        bold = fun (chunks: String): ReactElement {
                            return strong { +chunks }
                        }
                    }.unsafeCast<Any>()
                }
            }
        }
    }
}

fun RBuilder.advanced() {
    child(app) {
        attrs {
            locale = "en"
            messages = loadLocaleData("en")
        }
    }
}
