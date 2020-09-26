package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.overflow() {
    styledDiv {
        css { +BadgeStyles.overflow }
        div {
            badge {
                attrs.count = 99
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
            badge {
                attrs.count = 100
                a {
                    attrs {
                        classes = setOf("head-example")
                        href = "#"
                    }
                }
            }
            badge {
                attrs {
                    count = 99
                    overflowCount = 10
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
                    count = 1000
                    overflowCount = 999
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
