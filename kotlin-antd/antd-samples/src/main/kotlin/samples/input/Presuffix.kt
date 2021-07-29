package samples.input

import antd.icon.icon
import antd.input.input
import antd.tooltip.tooltip
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.presuffix() {
    styledDiv {
        css { +InputStyles.presuffix }
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
