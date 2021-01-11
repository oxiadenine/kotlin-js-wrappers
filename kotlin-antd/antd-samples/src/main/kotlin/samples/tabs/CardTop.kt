package samples.tabs

import antd.divider.divider
import antd.tabs.*
import kotlinx.html.*
import react.*
import react.dom.*
import samples.AppStyles
import styled.*

fun RBuilder.cardTop() {
    divider {  }
    h3 { +"Card Top Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
        div {
            attrs.classes = setOf("card-container")
            tabs {
                attrs.type = "card"
                tabPane {
                    attrs {
                        tab = "Tab Title 1"
                        key = "1"
                    }
                    p { +"Content of Tab Pane 1" }
                    p { +"Content of Tab Pane 1" }
                    p { +"Content of Tab Pane 1" }
                }
                tabPane {
                    attrs {
                        tab = "Tab Title 2"
                        key = "2"
                    }
                    p { +"Content of Tab Pane 2" }
                    p { +"Content of Tab Pane 2" }
                    p { +"Content of Tab Pane 2" }
                }
                tabPane {
                    attrs {
                        tab = "Tab Title 3"
                        key = "3"
                    }
                    p { +"Content of Tab Pane 3" }
                    p { +"Content of Tab Pane 3" }
                    p { +"Content of Tab Pane 3" }
                }
            }
        }
    }
}
