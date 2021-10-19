package samples.progress

import kotlinx.css.marginBottom
import kotlinx.css.marginRight
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ProgressStyles : StyleSheet("progress", isStatic = true) {
    val container by css {}
    val line by css {}
    val lineMini by css {}
    val circleDynamic by css {}
    val format by css {
        descendants("div.ant-progress-circle") {
            marginRight = 8.px
            marginBottom = 8.px
        }
        descendants("div.ant-progress-line") {
            marginRight = 8.px
            marginBottom = 8.px
        }
    }
    val segment by css {}
    val gradientLine by css {}
    val circle by css {
        descendants(".ant-progress-circle-wrap") {
            marginRight = 8.px
            marginBottom = 5.px
        }
        descendants(".ant-progress-line-wrap") {
            marginRight = 8.px
            marginBottom = 5.px
        }
    }
    val circleMini by css {}
    val dynamic by css {}
    val dashboard by css {}
    val linecap by css {}
    val steps by css {}
}

class ProgressApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Progress" }
        styledDiv {
            css { +ProgressStyles.container }
            line()
            lineMini()
            circleDynamic()
            format()
            segment()
            gradientLine()
            circle()
            circleMini()
            dynamic()
            dashboard()
            linecap()
            steps()
        }
    }
}

fun RBuilder.progressApp() = child(ProgressApp::class) {}
