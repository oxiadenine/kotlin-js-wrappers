package samples.badge

import antd.*
import antd.badge.*
import antd.button.*
import antd.button.button
import antd.icon.*
import antd.switch.*
import kotlinx.css.marginTop
import kotlinx.css.px
import kotlinx.html.*
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*
import styled.*

external interface ChangeDemoState : RState {
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

    private val handleChange = fun(checked: Boolean, _: MouseEvent) {
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
                            classes = setOf("head-example")
                            href = "#"
                        }
                    }
                }
                buttonGroup {
                    button {
                        attrs.onClick = decline
                        minusOutlined {}
                    }
                    button {
                        attrs.onClick = increase
                        plusOutlined {}
                    }
                }
            }
            styledDiv {
                css { marginTop = 10.px }
                badge {
                    attrs.dot = state.show
                    a {
                        attrs {
                            classes = setOf("head-example")
                            href = "#"
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
    styledDiv {
        css { +BadgeStyles.change }
        changeDemo()
    }
}
