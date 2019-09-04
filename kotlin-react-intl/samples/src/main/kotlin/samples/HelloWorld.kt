package samples

import kotlinext.js.js
import react.*
import react.dom.b
import react.dom.p
import reactintl.message.formattedMessage
import reactintl.provider.intlProvider

interface HelloWorldState : RState {
    var name: String
    var unreadCount: Number
}

class HelloWorld : RComponent<RProps, HelloWorldState>() {
    override fun HelloWorldState.init() {
        name = "Eric"
        unreadCount = 1000
    }

    override fun RBuilder.render() {
        p {
            formattedMessage {
                attrs {
                    id = "welcome"
                    defaultMessage = """Hello {name}, you have {unreadCount, number} {unreadCount, plural,
                      one {message}
                      other {messages}
                    }""".trimIndent()
                    values = js {
                        name = b { +state.name }
                        unreadCount = state.unreadCount
                    }.unsafeCast<Any>()
                }
            }
        }
    }
}

fun RBuilder.helloWorldApp() = child(HelloWorld::class) {}

fun RBuilder.helloWorld() {
    intlProvider {
        attrs.locale = "en"
        helloWorldApp()
    }
}
