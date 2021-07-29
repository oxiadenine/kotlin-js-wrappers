package samples.tabs

import antd.tabs.tabPane
import antd.tabs.tabs
import react.RBuilder
import react.key
import styled.css
import styled.styledDiv

private fun callback(key: String) {
    console.log(key)
}

fun RBuilder.card() {
    styledDiv {
        css { +TabsStyles.card }
        tabs {
            attrs {
                onChange = ::callback
                type = "card"
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
