package samples.steps

import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.TextAlign
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.marginTop
import kotlinx.css.minHeight
import kotlinx.css.paddingTop
import kotlinx.css.properties.border
import kotlinx.css.px
import kotlinx.css.textAlign
import react.*
import react.dom.*
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

class StepsApp : RComponent<RProps, RState>() {
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
