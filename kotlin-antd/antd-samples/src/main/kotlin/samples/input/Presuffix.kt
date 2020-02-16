package samples.input

import antd.icon.icon
import antd.input.input
import antd.tooltip.tooltip
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.presuffix() {
    div("input-container") {
        attrs.id = "input-presuffix"
        input {
            attrs {
                placeholder = "Enter your username"
                prefix = buildElement {
                    icon {
                        attrs {
                            type = "user"
                            style = js { color = "rgba(0,0,0,.25)" }
                        }
                    }
                }
                suffix = buildElement {
                    tooltip {
                        attrs.title = "Extra information"
                        icon {
                            attrs {
                                type = "info-circle"
                                style = js { color = "rgba(0,0,0,.45)" }
                            }
                        }
                    }
                }
            }
        }
    }
}
