package samples.tag

import antd.tag.checkableTag
import kotlinx.html.id
import react.*
import react.dom.div

interface MyTagState : RState {
    var checked: Boolean
}

class MyTag : RComponent<RProps, MyTagState>() {
    private val handleChange = fun (value: Boolean) {
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
    div("tag-container") {
        attrs.id = "tag-checkable"
        div {
            myTag { +"Tag 1" }
            myTag { +"Tag 2" }
            myTag { +"Tag 3" }
        }
    }
}
