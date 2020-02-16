package samples.slider

import antd.slider.slider
import antd.switch.switch
import kotlinx.html.id
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*

interface BasicDemoState : RState {
    var disabled: Boolean
}

class BasicDemo : RComponent<RProps, BasicDemoState>() {
    private val handleDisabledChange = fun (checked: Boolean, _: MouseEvent) {
        setState {
            disabled = checked
        }
    }

    override fun BasicDemoState.init() {
        disabled = false
    }

    override fun RBuilder.render() {
        div {
            slider {
                attrs {
                    defaultValue = 30
                    disabled = state.disabled
                }
            }
            slider {
                attrs {
                    range = true
                    defaultValue = arrayOf(20, 50)
                    disabled = state.disabled
                }
            }
            +"Disabled: "
            switch {
                attrs {
                    size = "small"
                    checked = state.disabled
                    onChange = handleDisabledChange
                }
            }
        }
    }
}

fun RBuilder.basicDemo() = child(BasicDemo::class) {}

fun RBuilder.basic() {
    div("slider-container") {
        attrs.id = "slider-basic"
        basicDemo()
    }
}
