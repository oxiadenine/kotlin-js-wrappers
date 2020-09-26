package samples.statistic

import react.*
import react.dom.*
import styled.*

object StatisticStyles : StyleSheet("statistic", isStatic = true) {
    val container by css {}
    val basic by css {}
    val card by css {}
    val unit by css {}
    val countdown by css {}
}

class StatisticApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Statistic" }
        styledDiv {
            css { +StatisticStyles.container }
            basic()
            card()
            unit()
            countdown()
        }
    }
}

fun RBuilder.statisticApp() = child(StatisticApp::class) {}
