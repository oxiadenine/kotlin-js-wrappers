package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("grid-container") {
        attrs.id = "grid-basic"
        div {
            row {
                col {
                    attrs.span = 12
                    +"col-12"
                }
                col {
                    attrs.span = 12
                    +"col-12"
                }
            }
            row {
                col {
                    attrs.span = 8
                    +"col-8"
                }
                col {
                    attrs.span = 8
                    +"col-8"
                }
                col {
                    attrs.span = 8
                    +"col-8"
                }
            }
            row {
                col {
                    attrs.span = 6
                    +"col-6"
                }
                col {
                    attrs.span = 6
                    +"col-6"
                }
                col {
                    attrs.span = 6
                    +"col-6"
                }
                col {
                    attrs.span = 6
                    +"col-6"
                }
            }
        }
    }
}
