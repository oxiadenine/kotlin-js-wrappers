package samples.tabs

import antd.divider.divider
import antd.icon.*
import antd.tabs.*
import react.*
import react.dom.*
import samples.AppStyles
import styled.*

fun RBuilder.icon() {
    divider {  }
    h3 { +"Icon Demo" }
    styledDiv {
        css {
            +TabsStyles.card
            +AppStyles.contentSection
        }
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
