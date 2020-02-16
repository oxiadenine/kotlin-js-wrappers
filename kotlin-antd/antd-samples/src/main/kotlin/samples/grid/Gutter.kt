package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.gutter() {
    div("grid-container") {
        attrs.id = "grid-gutter"
        div("gutter-example") {
            row {
                attrs.gutter = 16
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div("gutter-box") { +"col-6" }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div("gutter-box") { +"col-6" }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div("gutter-box") { +"col-6" }
                }
                col {
                    attrs {
                        className = "gutter-row"
                        span = 6
                    }
                    div("gutter-box") { +"col-6" }
                }
            }
        }
    }
}
