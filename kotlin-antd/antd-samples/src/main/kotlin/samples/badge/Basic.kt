package samples.badge

import antd.badge.badge
import antd.icon.clockCircleOutlined
import kotlinext.js.js
import kotlinx.html.classes
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.attrs
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +BadgeStyles.basic }
        div {
            badge {
                attrs.count = 5
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
            badge {
                attrs {
                    count = 0
                    showZero = true
                }
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
            badge {
                attrs {
                    count = buildElement {
                        clockCircleOutlined {
                            attrs.style = js { color = "#f5222d" }
                        }
                    }
                }
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
        }
    }
}
