package samples.card

import antd.card.card
import antd.grid.col
import antd.grid.row
import kotlinx.css.background
import kotlinx.css.padding
import react.RBuilder
import styled.css
import styled.styledDiv

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
