package samples.grid

import antd.grid.*
import antd.grid.col
import react.*
import react.dom.*
import styled.*

fun RBuilder.flex() {
    styledDiv {
        css { +GridStyles.flex }
        div {
            p { +"sub-element align left" }
            row {
                attrs {
                    type = "flex"
                    justify = "start"
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
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align center" }
            row {
                attrs {
                    type = "flex"
                    justify = "center"
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
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align right" }
            row {
                attrs {
                    type = "flex"
                    justify = "end"
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
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element monospaced arrangement" }
            row {
                attrs {
                    type = "flex"
                    justify = "space-between"
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
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
            p { +"sub-element align full" }
            row {
                attrs {
                    type = "flex"
                    justify = "space-around"
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
                col {
                    attrs.span = 4
                    +"col-4"
                }
            }
        }
    }
}
