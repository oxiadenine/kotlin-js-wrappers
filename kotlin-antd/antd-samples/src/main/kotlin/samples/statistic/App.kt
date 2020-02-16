package samples.statistic

import react.*
import react.dom.*

class StatisticApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Statistic" }
        div {
            basic()
            card()
            unit()
            countdown()
        }
    }
}

fun RBuilder.statisticApp() = child(StatisticApp::class) {}
