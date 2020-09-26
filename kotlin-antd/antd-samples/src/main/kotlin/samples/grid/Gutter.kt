package samples.grid

import antd.grid.*
import antd.grid.col
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.gutter() {
    styledDiv {
        css { +GridStyles.gutter }
        div {
            attrs.classes = setOf("gutter-example")
            row {
                attrs.gutter = 16
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div {
                        attrs.classes = setOf("gutter-box")
                        +"col-6"
                    }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div {
                        attrs.classes = setOf("gutter-box")
                        +"col-6"
                    }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div {
                        attrs.classes = setOf("gutter-box")
                        +"col-6"
                    }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div {
                        attrs.classes = setOf("gutter-box")
                        +"col-6"
                    }
                }
            }
        }
    }
}
