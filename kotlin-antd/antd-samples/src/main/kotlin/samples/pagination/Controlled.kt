package samples.pagination

import antd.pagination.*
import react.*
import styled.*

external interface ControlledAppState : RState {
    var current: Number
}

class ControlledApp : RComponent<RProps, ControlledAppState>() {
    private val handleChange = fun(page: Number, _: Number?) {
        console.log(page)

        setState {
            current = page
        }
    }

    override fun ControlledAppState.init() {
        current = 3
    }

    override fun RBuilder.render() {
        pagination {
            attrs {
                current = state.current
                onChange = handleChange
                total = 50
            }
        }
    }
}

fun RBuilder.controlledApp() = child(ControlledApp::class) {}

fun RBuilder.controlled() {
    styledDiv {
        css { +PaginationStyles.controlled }
        controlledApp()
    }
}
