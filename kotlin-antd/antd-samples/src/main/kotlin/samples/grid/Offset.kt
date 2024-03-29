package samples.grid

import antd.grid.col
import antd.grid.row
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.offset() {
    styledDiv {
        css { +GridStyles.offset }
        div {
            row {
                col {
                    attrs.span = 8
                    +"col-8"
                }
                col {
                    attrs {
                        span = 8
                        offset = 8
                    }
                    +"col-8"
                }
            }
            row {
                col {
                    attrs {
                        span = 6
                        offset = 6
                    }
                    +"col-6-col-offset-6"
                }
                col {
                    attrs {
                        span = 6
                        offset = 6
                    }
                    +"col-6-col-offset-6"
                }
            }
            row {
                col {
                    attrs {
                        span = 12
                        offset = 6
                    }
                    +"col-12-col-offset-6"
                }
            }
        }
    }
}
