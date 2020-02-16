package samples.badge

import antd.badge.badge
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.overflow() {
    div("badge-container") {
        attrs.id = "badge-overflow"
        div {
            badge {
                attrs.count = 99
                a {
                    attrs {
                        href = "#"
                        classes = setOf("head-example")
                    }
                }
            }
            badge {
                attrs.count = 100
                a {
                    attrs {
                        href = "#"
                        classes = setOf("head-example")
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
                        href = "#"
                        classes = setOf("head-example")
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
                        href = "#"
                        classes = setOf("head-example")
                    }
                }
            }
        }
    }
}
