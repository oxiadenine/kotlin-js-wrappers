package samples.grid

import antd.grid.col
import antd.grid.row
import react.RBuilder
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

fun RBuilder.flex() {
    styledDiv {
        css { +GridStyles.flex }
        div {
            p { +"sub-element align left" }
            row {
                attrs.justify = "start"
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align center" }
            row {
                attrs.justify = "center"
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align right" }
            row {
                attrs.justify = "end"
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element monospaced arrangement" }
            row {
                attrs.justify = "space-between"
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align full" }
            row {
                attrs.justify = "space-around"
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
        }
    }
}
