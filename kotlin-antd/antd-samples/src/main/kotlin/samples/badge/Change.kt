package samples.badge

import antd.MouseEventHandler
import antd.badge.badge
import antd.button.button
import antd.button.buttonGroup
import antd.icon.icon
import antd.switch.switch
import kotlinext.js.js
import kotlinx.html.classes
import kotlinx.html.id
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*

interface ChangeDemoState : RState {
    var count: Any
    var show: Boolean
}

class ChangeDemo : RComponent<RProps, ChangeDemoState>() {
    private val increase: MouseEventHandler<Any> = {
        val countIncreased = state.count.unsafeCast<Number>().toInt() + 1

        setState {
            count = countIncreased
        }
    }

    private val decline: MouseEventHandler<Any> = {
        var countDeclined = state.count.unsafeCast<Number>().toInt() - 1

        if (countDeclined < 0) {
            countDeclined = 0
        }

        setState {
            count = countDeclined
        }
    }

    private val handleChange = fun (checked: Boolean, _: MouseEvent) {
        setState {
            show = checked
        }
    }

    override fun ChangeDemoState.init() {
        count = 5
        show = true
    }

    override fun RBuilder.render() {
        div {
            div {
                badge {
                    attrs.count = state.count
                    a {
                        attrs {
                            href = "#"
                            classes = setOf("head-example")
                        }
                    }
                }
                buttonGroup {
                    button {
                        attrs.onClick = decline
                        icon {
                            attrs.type = "minus"
                        }
                    }
                    button {
                        attrs.onClick = increase
                        icon {
                            attrs.type = "plus"
                        }
                    }
                }
            }
            div {
                attrs.jsStyle = js { marginTop = 10 }
                badge {
                    attrs.dot = state.show
                    a {
                        attrs {
                            href = "#"
                            classes = setOf("head-example")
                        }
                    }
                }
                switch {
                    attrs {
                        onChange = handleChange
                        checked = state.show
                    }
                }
            }
        }
    }
}

fun RBuilder.changeDemo() = child(ChangeDemo::class) {}

fun RBuilder.change() {
    div("badge-container") {
        attrs.id = "badge-change"
        changeDemo()
    }
}
