package samples.badge

import antd.badge.*
import antd.icon.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
