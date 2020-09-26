package samples.statistic

import antd.card.card
import antd.grid.col
import antd.grid.row
import antd.icon.icon
import antd.statistic.statistic
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.jsStyle
import styled.css
import styled.styledDiv

fun RBuilder.card() {
    styledDiv {
        css { +StatisticStyles.card }
        div {
            attrs.jsStyle = js {
                background = "#ECECEC"
                padding = "30px"
            }
            row {
                attrs.gutter = 16
                col {
                    attrs.span = 12
                    card {
                        statistic {
                            attrs {
                                title = "Active"
                                value = 11.28
                                precision = 2
                                valueStyle = js { color = "#3f8600" }
                                prefix = buildElement {
                                    icon {
                                        attrs.type = "arrow-up"
                                    }
                                }
                                suffix = "%"
                            }
                        }
                    }
                }
                col {
                    attrs.span = 12
                    card {
                        statistic {
                            attrs {
                                title = "Idle"
                                value = 9.3
                                precision = 2
                                valueStyle = js { color = "#cf1322" }
                                prefix = buildElement {
                                    icon {
                                        attrs.type = "arrow-down"
                                    }
                                }
                                suffix = "%"
                            }
                        }
                    }
                }
            }
        }
    }
}
