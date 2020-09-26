package samples.modal

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object ModalStyles : StyleSheet("modal", isStatic = true) {
    val container by css {}
    val basic by css {
        descendants(".ant-modal") {
            descendants("p") {
                margin(0.px)
            }
        }
    }
    val footer by css {}
    val confirmPromise by css {}
    val locale by css {}
    val position by css {}
    val async by css {}
    val confirm by css {}
    val info by css {}
    val manual by css {}
    val butonProps by css {}
    val confirmRouter by css {}
}

class ModalApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Modal" }
        styledDiv {
            css { +ModalStyles.container }
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
