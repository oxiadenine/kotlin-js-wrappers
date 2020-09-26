package samples.grid

import antd.grid.col
import antd.grid.row
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.responsive() {
    styledDiv {
        css { +GridStyles.responsive }
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
