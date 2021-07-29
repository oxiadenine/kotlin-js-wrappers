package samples.grid

import antd.grid.col
import antd.grid.row
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.flexOrder() {
    styledDiv {
        css { +GridStyles.flexOrder }
        div {
            row {
                col {
                    attrs {
                        span = 6
                        order = 4
                    }
                    +"1 col-order-4"
                }
                col {
                    attrs {
                        span = 6
                        order = 3
                    }
                    +"2 col-order-3"
                }
                col {
                    attrs {
                        span = 6
                        order = 2
                    }
                    +"3 col-order-2"
                }
                col {
                    attrs {
                        span = 6
                        order = 1
                    }
                    +"4 col-order-1"
                }
            }
        }
    }
}
