package samples.grid

import antd.grid.row
import antd.grid.col
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.flex() {
    div("grid-container") {
        attrs.id = "grid-flex"
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
