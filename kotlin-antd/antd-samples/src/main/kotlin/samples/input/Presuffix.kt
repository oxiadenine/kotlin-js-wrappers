package samples.input

import antd.icon.*
import antd.input.*
import antd.tooltip.*
import kotlinext.js.*
import react.*
import styled.*

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
