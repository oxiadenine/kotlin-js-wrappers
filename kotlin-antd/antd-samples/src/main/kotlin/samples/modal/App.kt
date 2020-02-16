package samples.modal

import react.*
import react.dom.*

class ModalApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Modal" }
        div {
            basic()
            footer()
            confirmPromise()
            locale()
            position()
            async()
            confirm()
            info()
            manual()
            buttonProps()
        }
    }
}

fun RBuilder.modalApp() = child(ModalApp::class) {}
