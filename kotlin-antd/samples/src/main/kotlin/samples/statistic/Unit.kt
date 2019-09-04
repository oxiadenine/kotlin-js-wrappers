package samples.statistic

import antd.grid.col
import antd.grid.row
import antd.icon.icon
import antd.statistic.statistic
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div

fun RBuilder.unit() {
    div("statistic-container") {
        attrs.id = "statistic-unit"
        row {
            attrs.gutter = 16
            col {
                attrs.span = 12
                statistic {
                    attrs {
                        title = "Feedback"
                        value = 1128
                        prefix = buildElement {
                            icon {
                                attrs.type = "like"
                            }
                        }
                    }
                }
            }
            col {
                attrs.span = 12
                statistic {
                    attrs {
                        title = "Unmerged"
                        value = 93
                        suffix = "/ 100"
                    }
                }
            }
        }
    }
}
