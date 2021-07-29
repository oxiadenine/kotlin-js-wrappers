package samples

import kotlinext.js.*
import kotlinx.css.fontSize
import kotlinx.css.px
import react.*
import react.dom.*
import reactintl.message.*
import reactintl.provider.*
import styled.css
import styled.styledSpan
import kotlin.js.Date
import kotlin.random.*

private fun loadLocaleData(locale: String): dynamic {
    return when (locale) {
        "fr" -> require("./fr.json")
        "en" -> require("./en.json")
        else -> require("./en.json")
    }
}

external interface AdvancedProps : RProps {
    var locale: String
    var messages: Any
}

private val app = fc<AdvancedProps> { props ->
    intlProvider {
        attrs {
            locale = props.locale
            defaultLocale = "en"
            messages = props.messages
        }
        p {
            styledSpan {
                css { fontSize = 30.px }
                +"AST"
            }
            br {}
            formattedMessage { attrs.id = "simple" }
            br {}
            formattedMessage {
                attrs {
                    id = "placeholder"
                    values = js { name = "John" }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "date"
                    values = js { ts = Date.now() }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "time"
                    values = js { ts = Date.now() }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "number"
                    values = js { num = Random.nextInt() * 1000 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "plural"
                    values = js { num = 1 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "plural"
                    values = js { num = 99 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "select"
                    values = js { gender = "male" }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "select"
                    values = js { gender = "female" }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 1 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 2 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 3 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "selectordinal"
                    values = js { order = 4 }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "richtext"
                    values = js {
                        num = 99
                        bold = fun(chunks: String): ReactElement {
                            return buildElement {
                                strong { +chunks }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.advanced() = child(app) {
    attrs {
        locale = "en"
        messages = loadLocaleData("en").unsafeCast<Any>()
    }
}
