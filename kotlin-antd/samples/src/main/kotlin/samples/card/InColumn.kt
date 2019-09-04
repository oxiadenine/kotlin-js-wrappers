package samples.card

import antd.card.card
import antd.grid.col
import antd.grid.row
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.jsStyle

fun RBuilder.inColumn() {
    div("card-container") {
        attrs.id = "card-in-column"
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
