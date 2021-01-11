package samples.tabs

import antd.divider.divider
import antd.tabs.*
import react.*
import react.dom.h3
import samples.AppStyles
import styled.*


fun RBuilder.centered() {
    divider {  }
    h3 { +"Centered Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
        tabs {
            attrs {
                defaultActiveKey = "1"
                centered = true
            }
            tabPane {
                attrs {
                    tab = "Tab 1"
                    key = "1"
                }
                +"Content of Tab Pane 1"
            }
            tabPane {
                attrs {
                    tab = "Tab 2"
                    key = "2"
                }
                +"Content of Tab Pane 2"
            }
            tabPane {
                attrs {
                    tab = "Tab 3"
                    key = "3"
                }
                +"Content of Tab Pane 3"
            }
        }
    }
}
