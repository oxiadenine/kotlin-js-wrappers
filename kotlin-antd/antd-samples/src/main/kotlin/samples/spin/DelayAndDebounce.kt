package samples.spin

import antd.alert.alert
import antd.spin.spin
import antd.switch.switch
import kotlinext.js.js
import kotlinx.html.id
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.div
import react.dom.jsStyle

interface DelayAndDebounceCardState : RState {
    var loading: Boolean
}

class DelayAndDebounceCard : RComponent<RProps, DelayAndDebounceCardState>() {
    private val toggle = fun (value: Boolean, _: MouseEvent) {
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
    div("spin-container") {
        attrs.id = "spin-delay-and-debounce"
        delayAndDebounceCard()
    }
}
