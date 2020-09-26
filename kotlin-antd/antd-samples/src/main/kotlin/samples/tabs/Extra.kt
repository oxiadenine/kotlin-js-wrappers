package samples.tabs

import antd.button.*
import antd.tabs.*
import react.*
import styled.*

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
