package samples.card

import kotlinx.css.margin
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.div
import react.dom.h2
import styled.StyleSheet

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

class CardApp : RComponent<RProps, State>() {
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
