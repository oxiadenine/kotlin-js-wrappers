package samples.grid

import antd.grid.*
import kotlinext.js.*
import react.*
import styled.*

fun RBuilder.responsiveMore() {
    styledDiv {
        css { +GridStyles.responsiveMore }
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
