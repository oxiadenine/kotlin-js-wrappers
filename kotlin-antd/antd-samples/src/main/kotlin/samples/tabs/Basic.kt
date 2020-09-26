package samples.tabs

import antd.tabs.*
import react.*
import styled.*

private fun callback(key: String) {
    console.log(key)
}

fun RBuilder.basic() {
    styledDiv {
        css { +TabsStyles.basic }
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
