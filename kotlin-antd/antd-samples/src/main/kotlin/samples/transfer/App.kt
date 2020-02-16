package samples.transfer

import react.*
import react.dom.*

class TransferApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Transfer" }
        div {
            basic()
            search()
            advanced()
            customItem()
            largeData()
        }
    }
}

fun RBuilder.transferApp() = child(TransferApp::class) {}
