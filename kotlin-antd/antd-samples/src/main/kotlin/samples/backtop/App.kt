package samples.backtop

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

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
