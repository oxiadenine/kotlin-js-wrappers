package samples.card

import antd.card.*
import antd.grid.*
import antd.grid.col
import kotlinx.css.background
import kotlinx.css.padding
import react.*
import styled.*

fun RBuilder.inColumn() {
    styledDiv {
        css { +CardStyles.inColumn }
        styledDiv {
            css {
                background = "#ECECEC"
                padding = "30px"
            }
            row {
                attrs.gutter = 10
                col {
                    attrs.span = 8
                    card {
                        attrs {
                            title = "Card title"
                            bordered = false
                        }
                        +"Card content"
                    }
                }
                col {
                    attrs.span = 8
                    card {
                        attrs {
                            title = "Card title"
                            bordered = false
                        }
                        +"Card content"
                    }
                }
                col {
                    attrs.span = 8
                    card {
                        attrs {
                            title = "Card title"
                            bordered = false
                        }
                        +"Card content"
                    }
                }
            }
        }
    }
}
