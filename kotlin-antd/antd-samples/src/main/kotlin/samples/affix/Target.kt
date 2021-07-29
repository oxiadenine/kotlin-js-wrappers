package samples.affix

import antd.affix.affix
import antd.button.button
import kotlinx.html.classes
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.div
import styled.css
import styled.styledDiv

class TargetDemo : RComponent<RProps, State>() {
    private var container: dynamic = null

    override fun RBuilder.render() {
        div {
            attrs.classes = setOf("scrollable-container")
            ref = container
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
