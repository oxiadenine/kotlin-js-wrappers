package samples

import kotlinx.css.*
import react.*
import react.dom.*
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
    val codeBox by css {
        padding(vertical = 10.px, horizontal = 20.px)
        background = Color.lightGrey.value
        border = "${Color.darkGrey.value} 1px ${BorderStyle.solid.name}"
    }
    val code by css {
        display = Display.flex
        flexDirection = FlexDirection.row
        flexWrap = FlexWrap.nowrap
        children("*") {
            margin(all = 5.px)
        }
        children("span") {
            marginLeft = LinearDimension.auto
            paddingLeft = 50.px
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
            formatDate()
            relativeTime()
            calendarTime()
            multipleLocale()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
