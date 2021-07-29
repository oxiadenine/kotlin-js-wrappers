package samples.tabs

import antd.icon.androidOutlined
import antd.icon.appleOutlined
import antd.tabs.tabPane
import antd.tabs.tabs
import react.RBuilder
import react.buildElement
import react.dom.span
import react.key
import styled.css
import styled.styledDiv

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
