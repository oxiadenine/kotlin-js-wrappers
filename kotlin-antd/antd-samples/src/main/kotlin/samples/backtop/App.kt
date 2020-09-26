package samples.backtop

import kotlinx.css.Color
import kotlinx.css.TextAlign
import kotlinx.css.backgroundColor
import kotlinx.css.borderRadius
import kotlinx.css.bottom
import kotlinx.css.color
import kotlinx.css.fontSize
import kotlinx.css.height
import kotlinx.css.lineHeight
import kotlinx.css.properties.LineHeight
import kotlinx.css.px
import kotlinx.css.textAlign
import kotlinx.css.width
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

object BackTopStyles : StyleSheet("back-top", isStatic = true) {
    val container by css {}
    val basic by css {}
    val custom by css {
        descendants(".ant-back-top") {
            bottom = 100.px
        }
        descendants(".ant-back-top-inner") {
            height = 40.px
            width = 40.px
            lineHeight = LineHeight("40px")
            borderRadius = 4.px
            backgroundColor = Color("#1088e9")
            color = Color.white
            textAlign = TextAlign.center
            fontSize = 20.px
        }
    }
}

class BackTopApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"BackTop" }
        styledDiv {
            css { +BackTopStyles.container }
            basic()
            custom()
        }
    }
}

fun RBuilder.backTopApp() = child(BackTopApp::class) {}
