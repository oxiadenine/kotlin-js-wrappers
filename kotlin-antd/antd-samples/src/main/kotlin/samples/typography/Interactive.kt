package samples.typography

import antd.typography.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
