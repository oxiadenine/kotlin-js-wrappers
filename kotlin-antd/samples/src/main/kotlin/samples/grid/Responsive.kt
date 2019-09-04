package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.responsive() {
    div("grid-container") {
        attrs.id = "grid-responsive"
        row {
            col {
                attrs {
                    xs = 2
                    sm = 4
                    md = 6
                    lg = 9
                    xl = 10
                }
                +"Col"
            }
            col {
                attrs {
                    xs = 20
                    sm = 16
                    md = 12
                    lg = 8
                    xl = 4
                }
                +"Col"
            }
            col {
                attrs {
                    xs = 2
                    sm = 4
                    md = 6
                    lg = 9
                    xl = 10
                }
                +"Col"
            }
        }
    }
}
