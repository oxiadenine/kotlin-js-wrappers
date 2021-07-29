package samples.steps

import kotlinx.css.*
import kotlinx.css.properties.border
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object StepsStyles : StyleSheet("steps", isStatic = true) {
    val container by css {}
    val simple by css {}
    val smallSize by css {}
    val icon by css {}
    val stepNext by css {
        descendants(".steps-content") {
            minHeight = 200.px
            marginTop = 16.px
            paddingTop = 80.px
            backgroundColor = Color("#fafafa")
            border(1.px, BorderStyle.dashed, Color("#e9e9e9"))
            borderRadius = 6.px
            textAlign = TextAlign.center
        }
        descendants(".steps-action") {
            marginTop = 24.px
        }
    }
    val vertical by css {}
    val verticalSmall by css {}
    val error by css {}
    val progressDot by css {}
    val customizedProgressDot by css {}
    val clickable by css {}
}

class StepsApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Steps" }
        styledDiv {
            css { +StepsStyles.container }
            simple()
            smallSize()
            icon()
            stepNext()
            vertical()
            verticalSmall()
            error()
            progressDot()
            customizedProgressDot()
            clickable()
        }
    }
}

fun RBuilder.stepsApp() = child(StepsApp::class) {}
