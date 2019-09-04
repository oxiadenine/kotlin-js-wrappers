package samples.mention

import antd.mention.mention
import antd.mention.nav
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private val webFrameworks = arrayOf(
        js {
            name = "React"
            type = "JavaScript"
        },
        js {
            name = "Angular"
            type = "JavaScript"
        },
        js {
            name = "Laravel"
            type = "PHP"
            disabled = true
        },
        js {
            name = "Flask"
            type = "Python"
        },
        js {
            name = "Django"
            type = "Python"
        }
)

private fun handleSelect(suggestion: Any, data: Any?) {
    console.log("onSelect", suggestion, data)
}

interface CustomTagNavMentionState : RState {
    var suggestions: Array<Any>
}

class CustomTagNavMention : RComponent<RProps, CustomTagNavMentionState>() {
    private val handleSearchChange = fun (searchValue: String, _: String) {
        val filtered = webFrameworks.filter { item ->
            item.name.unsafeCast<String>().toLowerCase().contains(searchValue.toLowerCase())
        }
        val suggestionList = filtered.map { suggestion ->
            buildElement {
                nav {
                    attrs {
                        value = suggestion.name.unsafeCast<String>()
                        data = suggestion.unsafeCast<Any>()
                    }
                    span { +"${suggestion.name} - ${suggestion.type}" }
                }
            }
        }.toTypedArray()

        setState {
            suggestions = suggestionList.unsafeCast<Array<Any>>()
        }
    }

    override fun CustomTagNavMentionState.init() {
        suggestions = emptyArray()
    }

    override fun RBuilder.render() {
        mention {
            attrs {
                placeholder = "@someone"
                style = js { width = "100%" }
                suggestions = state.suggestions
                onSearchChange = handleSearchChange
                onSelect = ::handleSelect
            }
        }
    }
}

fun RBuilder.customTagNavMention() = child(CustomTagNavMention::class) {}

fun RBuilder.customTag() {
    div("mention-container") {
        attrs.id = "mention-custom-tag"
        customTagNavMention()
    }
}
