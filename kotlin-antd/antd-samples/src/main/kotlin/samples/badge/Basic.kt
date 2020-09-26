package samples.badge

import antd.badge.badge
import antd.icon.icon
import kotlinext.js.js
import kotlinx.html.classes
import react.*
import react.dom.*
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
                        icon {
                            attrs {
                                type = "clock-circle"
                                style = js { color = "#f5222d" }
                            }
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
