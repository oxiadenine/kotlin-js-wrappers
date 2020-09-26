package samples.transfer

import react.*
import react.dom.*
import styled.*

object TransferStyles : StyleSheet("transfer", isStatic = true) {
    val container by css {}
    val basic by css {}
    val search by css {}
    val advanced by css {}
    val customItem by css {}
    val largeData by css {}
}

class TransferApp : RComponent<RProps, RState>() {
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
