package samples.badge

import antd.badge.badge
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val colors = arrayOf("" +
        "pink",
        "red",
        "yellow",
        "orange",
        "cyan",
        "green",
        "blue",
        "purple",
        "geekblue",
        "magenta",
        "volcano",
        "gold",
        "lime"
)

fun RBuilder.colorful() {
    div("badge-container") {
        attrs.id = "badge-colorful"
        div {
            h4 {
                attrs.jsStyle = js { marginBottom = 16 }
                +"Presets:"
            }
            div {
                colors.map {
                    div {
                        attrs.key = it
                        badge {
                            attrs {
                                color = it
                                text = it
                            }
                        }
                    }
                }.toTypedArray()
            }
            h4 {
                attrs.jsStyle = js { margin = "16px 0" }
                +"Custom:"
            }
            div {
                badge {
                    attrs {
                        color = "#f50"
                        text = "#f50"
                    }
                }
                br {}
                badge {
                    attrs {
                        color = "#2db7f5"
                        text = "#2db7f5"
                    }
                }
                br {}
                badge {
                    attrs {
                        color = "#87d068"
                        text = "#87d068"
                    }
                }
                br {}
                badge {
                    attrs {
                        color = "#108ee9"
                        text = "#108ee9"
                    }
                }
            }
        }
    }
}
