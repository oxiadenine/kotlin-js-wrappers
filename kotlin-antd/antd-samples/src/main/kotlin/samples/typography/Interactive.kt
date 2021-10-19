package samples.typography

import antd.typography.CopyConfig
import antd.typography.EditConfig
import antd.typography.typographyParagraph
import kotlinext.js.jsObject
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

external interface InteractiveDemoState : State {
    var str: String
}

class InteractiveDemo : RComponent<Props, InteractiveDemoState>() {
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
            typographyParagraph {
                attrs.editable = jsObject<EditConfig> { onChange = handleChange }
                +state.str
            }
            typographyParagraph {
                attrs.copyable = true
                +"This is a copyable text."
            }
            typographyParagraph {
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
