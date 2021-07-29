package samples.statistic

import antd.grid.col
import antd.grid.row
import antd.icon.likeOutlined
import antd.statistic.statistic
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.unit() {
    styledDiv {
        css { +StatisticStyles.unit }
        row {
            attrs.gutter = 16
            col {
                attrs.span = 12
                statistic {
                    attrs {
                        title = "Feedback"
                        value = 1128
                        prefix = buildElement {
                            likeOutlined {}
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
