package samples.rate

import antd.rate.rate
import react.*
import react.dom.span
import styled.css
import styled.styledDiv

external interface RaterState : State {
    var value: Number?
}

class Rater : RComponent<Props, RaterState>() {
    private val handleChange = fun(newValue: Number) {
        setState {
            value = newValue
        }
    }

    override fun RaterState.init() {
        value = 3
    }

    override fun RBuilder.render() {
        span {
            rate {
                attrs {
                    onChange = handleChange
                    value = state.value
                }
            }
            if (state.value != null) {
                span("ant-rate-text") {
                    +"${state.value} stars"
                }
            }
        }
    }
}

fun RBuilder.rater() = child(Rater::class) {}

fun RBuilder.text() {
    styledDiv {
        css { +RateStyles.text }
        rater()
    }
}
