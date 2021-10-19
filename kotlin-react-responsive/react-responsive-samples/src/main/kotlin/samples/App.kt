package samples

import kotlinx.css.*
import react.*
import react.dom.*
import samples.sandbox.*
import samples.static.*
import styled.*

object AppStyles : StyleSheet("app", isStatic = true) {
    val header by css {
        padding(all = 10.px)
        textAlign = TextAlign.center
    }
    val content by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.center
        alignItems = Align.center
        padding(all = 10.px)
        children("*") {
            margin(all = 20.px)
        }
    }
}

class App : RComponent<Props, State>() {
    override fun RBuilder.render() {
        styledDiv {
            css { +AppStyles.header }
            h1 { +"Examples" }
        }
        styledDiv {
            css { +AppStyles.content }
            withHooks()
            withComponents()
            static()
            sandbox()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
