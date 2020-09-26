package samples.card

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object CardStyles : StyleSheet("card", isStatic = true) {
    val basic by css {
        descendants("p") {
            margin(all = 0.px)
        }
        descendants(".ant-card") {
            marginBottom = 30.px
        }
    }
    val borderLess by css {}
    val simple by css {}
    val flexibleContent by css {}
    val inColumn by css {}
    val loading by css {}
    val gridCard by css {}
    val inner by css {}
    val tabs by css {}
    val meta by css {}
}

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
