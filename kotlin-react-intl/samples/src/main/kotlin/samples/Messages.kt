package samples

import kotlinext.js.js
import react.*
import react.dom.br
import react.dom.p
import react.dom.strong
import reactintl.message.formattedMessage
import reactintl.provider.intlProvider
import kotlin.js.Date
import kotlin.random.Random

private val providerMessages = js {
    simple = "Hello world"
    placeholder = "Hello {name}"
    date = "Hello {ts, date}"
    time = "Hello {ts, time}"
    number = "Hello {num, number}"
    plural = "I have {num, plural, one {# dog} other {# dogs}}"
    select = "I am a {gender, select, male {boy} female {girl}}"
    selectordinal = """I am the {order, selectordinal,
        one {#st person}
        two {#nd person}
        =3 {#rd person}
        other {#th person}
    }""".trimIndent()
    richtext = "I have <bold>{num, plural, one {# dog} other {# dogs}}</bold>"
}

interface MessagesProps : RProps {
    var currentTime: Any /* Date | Number */
}

class Messages : RComponent<MessagesProps, RState>() {
    override fun RBuilder.render() {
        intlProvider {
            attrs {
                locale = "en"
                messages = providerMessages
            }
            p {
                formattedMessage {
                    attrs.id = "simple"
                }
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
}

fun RBuilder.messagesApp(handler: RHandler<MessagesProps>) = child(Messages::class, handler)

fun RBuilder.messages() {
    messagesApp {
        attrs.currentTime = Date()
    }
}
