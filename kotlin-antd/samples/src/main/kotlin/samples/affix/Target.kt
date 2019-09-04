package samples.affix

import antd.affix.affix
import antd.button.button
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

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
    div("affix-container") {
        attrs.id = "affix-target"
        targetDemo()
    }
}
