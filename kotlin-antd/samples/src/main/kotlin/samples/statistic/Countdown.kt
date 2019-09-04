package samples.statistic

import antd.grid.col
import antd.grid.row
import antd.statistic.countdown
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import kotlin.js.Date

private val decline = Date.now() + 1000 * 60 * 60 * 24 * 2 + 1000 * 30 // Moment is also OK

private fun onFinish() {
    console.log("finished!")
}

fun RBuilder.countdown() {
    div("statistic-container") {
        attrs.id = "statistic-countdown"
        row {
            attrs.gutter = 16
            col {
                attrs.span = 12
                countdown {
                    attrs {
                        title = "Countdown"
                        value = decline
                        onFinish = ::onFinish
                    }
                }
            }
            col {
                attrs.span = 12
                countdown {
                    attrs {
                        title = "Million Seconds"
                        value = decline
                        format = "HH:mm:ss:SSS"
                    }
                }
            }
            col {
                attrs {
                    span = 24
                    style = js { marginTop = 32 }
                }
                countdown {
                    attrs {
                        title = "Day Level"
                        value = decline
                        format = "D 天 H 时 m 分 s 秒"
                    }
                }
            }
        }
    }
}
