package samples.affix

import antd.affix.*
import antd.button.button
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

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
