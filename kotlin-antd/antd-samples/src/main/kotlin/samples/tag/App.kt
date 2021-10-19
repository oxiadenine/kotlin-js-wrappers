package samples.tag

import kotlinx.css.marginBottom
import kotlinx.css.px
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object TagStyles : StyleSheet("tag", isStatic = true) {
    val container by css {}
    val basic by css {}
    val control by css {}
    val hotTags by css {}
    val colorful by css {
        descendants(".ant-tag") {
            marginBottom = 8.px
        }
    }
    val checkable by css {}
    val controlled by css {}
}

class TagApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"Tag" }
        styledDiv {
            css { +TagStyles.container }
            basic()
            control()
            hotTags()
            colorful()
            checkable()
            controlled()
        }
    }
}

fun RBuilder.tagApp() = child(TagApp::class) {}
