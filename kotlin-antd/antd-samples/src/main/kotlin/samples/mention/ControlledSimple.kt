package samples.mention

import antd.mention.MentionComponent
import antd.mention.mention
import kotlinx.html.id
import react.*
import react.dom.*

interface ControlledSimpleAppState : RState {
    var value: Any
}

class ControlledSimpleApp : RComponent<RProps, ControlledSimpleAppState>() {
    private var mention: dynamic = null

    private val handleChange = fun (contentState: Any) {
        setState {
            value = contentState
        }
    }

    override fun ControlledSimpleAppState.init() {
        value = MentionComponent.toContentState("@afc163")
    }

    override fun componentDidMount() {
        mention.focus()
    }

    override fun RBuilder.render() {
        mention {
            ref { node -> mention = node }
            attrs {
                suggestions = arrayOf("afc163", "benjycui", "yiminghe", "RaoHai", "中文", "にほんご")
                value = state.value
                onChange = handleChange
            }
        }
    }
}

fun RBuilder.controlledSimpleApp() = child(ControlledSimpleApp::class) {}

fun RBuilder.controlledSimple() {
    div("mention-container") {
        attrs.id = "mention-controlled-simple"
        controlledSimpleApp()
    }
}
