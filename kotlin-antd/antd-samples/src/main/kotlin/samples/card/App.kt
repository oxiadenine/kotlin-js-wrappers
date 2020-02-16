package samples.card

import react.*
import react.dom.*

class CardApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Card" }
        div {
            basic()
            borderLess()
            simple()
            flexibleContent()
            inColumn()
            loading()
            gridCard()
            inner()
            tabs()
            meta()
        }
    }
}

fun RBuilder.cardApp() = child(CardApp::class) {}
