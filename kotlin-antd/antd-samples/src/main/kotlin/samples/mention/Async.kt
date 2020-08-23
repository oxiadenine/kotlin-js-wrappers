package samples.mention

import antd.mention.mention
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*
import kotlinx.browser.window

private val users = arrayOf("afc163", "benjycui", "yiminghe", "jljsj33", "dqaria", "RaoHai")

interface AsyncMentionState : RState {
    var suggestions: Array<Any>
    var loading: Boolean
}

class AsyncMention : RComponent<RProps, AsyncMentionState>() {
    private val fetchSuggestions = fun (value: String, callback: (suggestions: Array<Any>) -> Unit) {
        window.setTimeout({
            callback(users.filter { item -> item.contains(value) }.toTypedArray())
        }, 500)
    }

    private val handleSearchChange = fun (value: String, _: String) {
        fetchSuggestions(value) {
            setState {
                suggestions = it
                loading = false
            }
        }

        setState {
            loading = true
        }
    }

    override fun AsyncMentionState.init() {
        suggestions = emptyArray()
        loading = false
    }

    override fun RBuilder.render() {
        mention {
            attrs {
                style = js { width = "100%" }
                loading = state.loading
                suggestions = state.suggestions
                onSearchChange = handleSearchChange
            }
        }
    }
}

fun RBuilder.asyncMention() = child(AsyncMention::class) {}

fun RBuilder.async() {
    div("mention-container") {
        attrs.id = "mention-async"
        asyncMention()
    }
}
