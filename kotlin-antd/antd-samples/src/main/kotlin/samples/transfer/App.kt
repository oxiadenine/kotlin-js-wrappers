package samples.transfer

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TransferStyles : StyleSheet("transfer", isStatic = true) {
    val container by css {}
    val basic by css {}
    val search by css {}
    val advanced by css {}
    val customItem by css {}
    val largeData by css {}
}

class TransferApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Transfer" }
        styledDiv {
            css { +TransferStyles.container }
            basic()
            search()
            advanced()
            customItem()
            largeData()
        }
    }
}

fun RBuilder.transferApp() = child(TransferApp::class) {}
