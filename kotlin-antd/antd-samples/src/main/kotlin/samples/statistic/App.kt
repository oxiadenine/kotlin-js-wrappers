package samples.statistic

import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object StatisticStyles : StyleSheet("statistic", isStatic = true) {
    val container by css {}
    val basic by css {}
    val card by css {}
    val unit by css {}
    val countdown by css {}
}

class StatisticApp : RComponent<RProps, State>() {
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
