package samples.typography

import antd.typography.CopyConfig
import antd.typography.EditConfig
import antd.typography.paragraph
import kotlinext.js.jsObject
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

interface InteractiveDemoState : RState {
    var str: String
}

class InteractiveDemo : RComponent<RProps, InteractiveDemoState>() {
    private val handleChange: (String) -> Unit = { text ->
        console.log("Content change:", text)

        setState {
            str = text
        }
    }

    override fun InteractiveDemoState.init() {
        str = "This is an editable text."
    }

    override fun RBuilder.render() {
        div {
            paragraph {
                attrs.editable = jsObject<EditConfig> { onChange = handleChange }
                +state.str
            }
            paragraph {
                attrs.copyable = true
                +"This is a copyable text."
            }
            paragraph {
                attrs.copyable = jsObject<CopyConfig> { text = "Hello, Ant Design!" }
                +"Replace copy text."
            }
        }
    }
}

fun RBuilder.interactiveDemo() = child(InteractiveDemo::class) {}

fun RBuilder.interactive() {
    styledDiv {
        css { +TypographyStyles.interactive }
        interactiveDemo()
    }
}
