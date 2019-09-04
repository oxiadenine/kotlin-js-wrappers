package samples.grid

import antd.grid.ColSize
import antd.grid.col
import antd.grid.row
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.responsiveMore() {
    div("grid-container") {
        attrs.id = "grid-responsive-more"
        row {
            col {
                attrs {
                    xs = jsObject<ColSize> {
                        span = 5
                        offset = 1
                    }
                    lg = jsObject<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
            col {
                attrs {
                    xs = jsObject<ColSize> {
                        span = 11
                        offset = 1
                    }
                    lg = jsObject<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
            col {
                attrs {
                    xs = jsObject<ColSize> {
                        span = 5
                        offset = 1
                    }
                    lg = jsObject<ColSize> {
                        span = 6
                        offset = 2
                    }
                }
                +"Col"
            }
        }
    }
}
