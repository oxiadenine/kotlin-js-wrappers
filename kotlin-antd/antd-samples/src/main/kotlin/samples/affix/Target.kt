package samples.affix

import antd.affix.affix
import antd.button.button
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

class TargetDemo : RComponent<RProps, RState>() {
    private var container: dynamic = null

    override fun RBuilder.render() {
        div {
            attrs.classes = setOf("scrollable-container")
            ref { node -> container = node }
            div {
                attrs.classes = setOf("background")
                affix {
                    attrs.target = { container }
                    button {
                        attrs.type = "primary"
                        +"Fixed at the top of container"
                    }
                }
            }
        }
    }
}

fun RBuilder.targetDemo() = child(TargetDemo::class) {}

fun RBuilder.target() {
    styledDiv {
        css { +AffixStyles.target }
        targetDemo()
    }
}
