package samples.modal

import kotlinx.css.margin
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

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
    val hooks by css {}
}

class ModalApp : RComponent<Props, State>() {
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
            confirmRouter()
            info()
            manual()
            buttonProps()
            hooks()
        }
    }
}

fun RBuilder.modalApp() = child(ModalApp::class) {}
