package samples.statistic

import antd.button.button
import antd.grid.col
import antd.grid.row
import antd.statistic.statistic
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +StatisticStyles.basic }
        row {
            attrs.gutter = 16
            col {
                attrs.span = 12
                statistic {
                    attrs {
                        title = "Active Users"
                        value = 112893
                    }
                }
            }
            col {
                attrs.span = 12
                statistic {
                    attrs {
                        title = "Account Balance (CNY)"
                        value = 112893
                        precision = 2
                    }
                }
                button {
                    attrs {
                        style = js { marginTop = 16 }
                        type = "primary"
                    }
                    +"Recharge"
                }
            }
        }
    }
}
