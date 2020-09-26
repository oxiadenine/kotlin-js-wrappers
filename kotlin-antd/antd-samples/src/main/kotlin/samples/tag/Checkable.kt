package samples.tag

import antd.tag.*
import react.*
import react.dom.*
import styled.*

interface MyTagState : RState {
    var checked: Boolean
}

class MyTag : RComponent<RProps, MyTagState>() {
    private val handleChange = fun(value: Boolean) {
        setState {
            checked = value
        }
    }

    override fun MyTagState.init() {
        checked = true
    }

    override fun RBuilder.render() {
        checkableTag {
            attrs {
                checked = state.checked
                onChange = handleChange
            }
            childList.add(props.children)
        }
    }
}

fun RBuilder.myTag(handler: RHandler<RProps>) = child(MyTag::class, handler)

fun RBuilder.checkable() {
    styledDiv {
        css { +TagStyles.checkable }
        div {
            myTag { +"Tag 1" }
            myTag { +"Tag 2" }
            myTag { +"Tag 3" }
        }
    }
}
