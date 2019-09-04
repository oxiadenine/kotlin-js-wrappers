package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.sort() {
    div("grid-container") {
        attrs.id = "grid-sort"
        div {
            row {
                col {
                    attrs {
                        span = 18
                        push = 6
                    }
                    +"col-18 col-push-6"
                }
                col {
                    attrs {
                        span = 6
                        pull = 18
                    }
                    +"col-6 col-pull-18"
                }
            }
        }
    }
}
