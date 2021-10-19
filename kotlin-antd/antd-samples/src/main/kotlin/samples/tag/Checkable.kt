package samples.tag

import antd.tag.checkableTag
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface MyTagState : State {
    var checked: Boolean
}

class MyTag : RComponent<PropsWithChildren, MyTagState>() {
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
            childList.add(props.children.unsafeCast<ReactNode>())
        }
    }
}

fun RBuilder.myTag(handler: RHandler<Props>) = child(MyTag::class, handler)

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
