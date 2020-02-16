package samples.badge

import antd.badge.badge
import antd.icon.icon
import kotlinext.js.js
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("badge-container") {
        attrs.id = "badge-basic"
        div {
            badge {
                attrs.count = 5
                a {
                    attrs {
                        href = "#"
                        classes = setOf("head-example")
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
                        href = "#"
                        classes = setOf("head-example")
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
                        href = "#"
                        classes = setOf("head-example")
                    }
                }
            }
        }
    }
}
