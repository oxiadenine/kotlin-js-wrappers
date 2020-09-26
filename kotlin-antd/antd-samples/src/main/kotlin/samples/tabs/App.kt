package samples.tabs

import kotlinx.css.*
import react.*
import react.dom.*
import styled.*

object TabsStyles : StyleSheet("tabs", isStatic = true) {
    val container by css {}
    val basic by css {}
    val disabled by css {}
    val icon by css {}
    val slide by css {}
    val extra by css {}
    val size by css {}
    val position by css {}
    val card by css {}
    val editableCard by css {}
    val cardTop by css {
        descendants(".card-container") {
            children(".ant-tabs-card") {
                children(".ant-tabs-content") {
                    children(".ant-tabs-tabpane") {
                        padding(16.px)
                        background = Color.white.toString()
                    }
                }
                children(".ant-tabs-bar") {
                    borderColor = Color.white
                    descendants(".ant-tabs-tab") {
                        background = Color.transparent.toString()
                        borderColor = Color.transparent
                    }
                    descendants(".ant-tabs-tab-active") {
                        background = Color.white.toString()
                        borderColor = Color.white
                    }
                }
            }
        }
        descendants(".code-box-demo") {
            padding(24.px)
            overflow = Overflow.hidden
            background = "#F5F5F5"
        }
    }
    val customAddTrigger by css {}
    val nest by css {}
}

class TabsApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Tabs" }
        styledDiv {
            css { +TabsStyles.container }
            basic()
            disabled()
            icon()
            slide()
            extra()
            size()
            position()
            card()
            editableCard()
            cardTop()
            customAddTrigger()
            nest()
        }
    }
}

fun RBuilder.tabsApp() = child(TabsApp::class) {}
