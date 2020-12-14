package samples.tabs

import antd.icon.*
import antd.tabs.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.icon() {
    styledDiv {
        css { +TabsStyles.icon }
        tabs {
            attrs.defaultActiveKey = "2"
            tabPane {
                attrs {
                    tab = buildElement {
                        span {
                            appleOutlined {}
                            +"Tab 1"
                        }
                    }
                    key = "1"
                }
                +"Tab 1"
            }
            tabPane {
                attrs {
                    tab = buildElement {
                        span {
                            androidOutlined {}
                            +"Tab 2"
                        }
                    }
                    key = "2"
                }
                +"Tab 2"
            }
        }
    }
}
