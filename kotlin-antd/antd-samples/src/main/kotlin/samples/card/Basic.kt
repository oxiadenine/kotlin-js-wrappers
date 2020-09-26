package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.basic() {
    styledDiv {
        css { +CardStyles.basic }
        div {
            card {
                attrs {
                    title = "Default size card"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
            card {
                attrs {
                    size = "small"
                    title = "Small size card"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                    style = js { width = 300 }
                }
                p { +"Card content" }
                p { +"Card content" }
                p { +"Card content" }
            }
        }
    }
}
