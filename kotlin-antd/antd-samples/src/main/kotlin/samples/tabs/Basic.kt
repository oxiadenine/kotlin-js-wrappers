package samples.tabs

import antd.divider.divider
import antd.tabs.*
import react.*
import react.dom.h3
import samples.AppStyles
import styled.*

private fun callback(key: String) {
    console.log(key)
}

fun RBuilder.basic() {
    divider {  }
    h3 { +"Basic Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
        tabs {
            attrs {
                defaultActiveKey = "1"
                onChange = ::callback
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
