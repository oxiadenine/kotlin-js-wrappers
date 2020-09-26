package samples.tag

import kotlinx.css.marginBottom
import kotlinx.css.px
import react.*
import react.dom.*
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

class TagApp : RComponent<RProps, RState>() {
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
