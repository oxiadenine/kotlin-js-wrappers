package samples.grid

import antd.grid.ColSize
import antd.grid.col
import antd.grid.row
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.responsiveMore() {
    styledDiv {
        css { +GridStyles.responsiveMore }
        row {
            col {
                attrs {
                    xs = jso<ColSize> {
                        span = 5
                        offset = 1
                    }
                    lg = jso<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
            col {
                attrs {
                    xs = jso<ColSize> {
                        span = 11
                        offset = 1
                    }
                    lg = jso<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
            col {
                attrs {
                    xs = jso<ColSize> {
                        span = 5
                        offset = 1
                    }
                    lg = jso<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
        }
    }
}
