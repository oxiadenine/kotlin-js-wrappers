package samples.tabs

import antd.button.button
import antd.tabs.tabPane
import antd.tabs.tabs
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private val operation = buildElement {
   button { +"Extra Action" }
}

fun RBuilder.extra() {
    styledDiv {
        css { +TabsStyles.extra }
        tabs {
            attrs.tabBarExtraContent = operation
            tabPane {
                attrs {
                    tab = "Tab 1"
                    key = "1"
                }
                +"Content of tab 1"
            }
            tabPane {
                attrs {
                    tab = "Tab 2"
                    key = "2"
                }
                +"Content of tab 2"
            }
            tabPane {
                attrs {
                    tab = "Tab 3"
                    key = "3"
                }
                +"Content of tab 3"
            }
        }
    }
}
