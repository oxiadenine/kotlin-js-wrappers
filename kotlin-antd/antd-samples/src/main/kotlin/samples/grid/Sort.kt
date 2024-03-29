package samples.grid

import antd.grid.col
import antd.grid.row
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.sort() {
    styledDiv {
        css { +GridStyles.sort }
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
