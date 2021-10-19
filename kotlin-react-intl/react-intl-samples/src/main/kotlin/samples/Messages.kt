package samples

import kotlinext.js.*
import react.*
import react.dom.*
import reactintl.message.*
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
    intlProvider {
        attrs {
            locale = "en"
            messages = providerMessages
        }
        p {
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
                    }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "richertext"
                    values = js {
                        num = 99
                        bold = fun(chunks: String): ReactElement {
                            return buildElement {
                                strong { +chunks }
                            }
                        }
                    }.unsafeCast<Any>()
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "unicode"
                    values = js { placeholder = "world" }
                }
            }
            br {}
            formattedMessage {
                attrs {
                    id = "whatever"
                    defaultMessage = "Hello\u0020{placeholder}"
                    values = js { placeholder = "world" }
                }
            }
        }
    }
}

fun RBuilder.messages() = child(app)
