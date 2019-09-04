package samples.mention

import antd.mention.MentionComponent
import antd.mention.mention
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject {}))
}

private fun handleSelect(suggestion: String, data: Any?) {
    console.log("onSelect", suggestion)
}

private val users = arrayOf("afc163", "benjycui", "yiminghe", "jljsj33", "dqaria", "RaoHai")
private val tags = arrayOf("1.0", "2.0", "3.0")

interface MultipleTriggerAppState : RState {
    var suggestions: Array<Any>
}

class MultipleTriggerApp : RComponent<RProps, MultipleTriggerAppState>() {
    private val handleSearchChange = fun (value: String, trigger: String) {
        console.log("onSearchChange", value, trigger)

        val dataSource = if (trigger == "@") users else tags

        setState {
            suggestions = dataSource.filter { item -> item.contains(value) }.toTypedArray()
        }
    }

    override fun MultipleTriggerAppState.init() {
        suggestions = emptyArray()
    }

    override fun RBuilder.render() {
        mention {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
                placeholder = "input @ to mention people, # to mention tag"
                prefix = arrayOf("@", "#")
                onSearchChange = handleSearchChange
                suggestions = state.suggestions
                onSelect = ::handleSelect
            }
        }
    }
}

fun RBuilder.multipleTriggerApp() = child(MultipleTriggerApp::class) { }

fun RBuilder.multipleTrigger() {
    div("mention-container") {
        attrs.id = "mention-multiple-trigger"
        multipleTriggerApp()
    }
}
