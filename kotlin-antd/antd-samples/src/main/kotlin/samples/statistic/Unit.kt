package samples.statistic

import antd.grid.*
import antd.icon.*
import antd.statistic.*
import react.*
import styled.*

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
