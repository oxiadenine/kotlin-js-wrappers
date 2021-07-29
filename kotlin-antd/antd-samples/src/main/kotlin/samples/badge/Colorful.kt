package samples.badge

import antd.badge.badge
import kotlinx.css.margin
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.dom.br
import react.dom.div
import react.dom.key
import styled.css
import styled.styledDiv
import styled.styledH4

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
    styledDiv {
        css { +BadgeStyles.colorful }
        div {
            styledH4 {
                css { marginBottom = 16.px }
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
            styledH4 {
                css { margin(16.px, 0.px) }
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
