package samples.tabs

import antd.icon.icon
import antd.tabs.tabPane
import antd.tabs.tabs
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.span

fun RBuilder.icon() {
    div("tabs-container") {
        attrs.id = "tabs-icon"
        tabs {
            attrs.defaultActiveKey = "2"
            tabPane {
                attrs {
                    tab = buildElement {
                        span {
                            icon {
                                attrs.type = "apple"
                            }
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
                            icon {
                                attrs.type = "android"
                            }
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
