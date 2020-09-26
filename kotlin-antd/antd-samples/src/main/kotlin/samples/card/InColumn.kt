package samples.card

import antd.card.card
import antd.grid.col
import antd.grid.row
import kotlinext.js.js
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import styled.css
import styled.styledDiv

fun RBuilder.inColumn() {
    styledDiv {
        css { +CardStyles.inColumn }
        div {
            attrs.jsStyle = js {
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
