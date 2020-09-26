package samples.spin

import antd.alert.*
import antd.spin.*
import antd.switch.*
import kotlinext.js.*
import org.w3c.dom.events.*
import react.*
import react.dom.*
import styled.*

interface DelayAndDebounceCardState : RState {
    var loading: Boolean
}

class DelayAndDebounceCard : RComponent<RProps, DelayAndDebounceCardState>() {
    private val toggle = fun(value: Boolean, _: MouseEvent) {
        setState {
            loading = value
        }
    }

    override fun DelayAndDebounceCardState.init() {
        loading = false
    }

    override fun RBuilder.render() {
        val container = buildElement {
            alert {
                attrs {
                    message = "Alert message title"
                    description = "Further details about the context of this alert."
                    type = "info"
                }
            }
        }

        div {
            spin {
                attrs {
                    spinning = state.loading
                    delay = 500
                }
                childList.add(container)
            }
            div {
                attrs.jsStyle = js { marginTop = 16 }
                +"Loading state："
                switch {
                    attrs {
                        checked = state.loading
                        onChange = toggle
                    }
                }
            }
        }
    }
}

fun RBuilder.delayAndDebounceCard() = child(DelayAndDebounceCard::class) {}

fun RBuilder.delayAndDebounce() {
    styledDiv {
        css { +SpinStyles.delayAndDebounce }
        delayAndDebounceCard()
    }
}
