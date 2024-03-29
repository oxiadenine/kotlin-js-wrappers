package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

external interface PrefixAppState : State {
    var prefix: String
}

class PrefixApp : RComponent<Props, PrefixAppState>() {
    private val mockData = js {}

    init {
        mockData["@"] = arrayOf("afc163", "zombiej", "yesmeck")
        mockData["#"] = arrayOf("1.0", "2.0", "3.0")
    }

    private val handleSearch: (String, String) -> Unit = { _, newPrefix ->
        setState {
            prefix = newPrefix
        }
    }

    override fun PrefixAppState.init() {
        prefix = "@"
    }

    override fun RBuilder.render() {
        mentions {
            attrs {
                style = js { width = "100%" }
                placeholder = "input @ to mention people, # to mention tag"
                prefix = arrayOf("@", "#")
                onSearch = handleSearch
            }
            val options = (mockData[state.prefix] as Array<String>?
                ?: emptyArray()).map {
                option {
                    attrs {
                        key = it
                        value = it
                    }
                    +it
                }
            }.toTypedArray()

            childList.add(options.unsafeCast<ReactNode>())
        }
    }
}

fun RBuilder.prefixApp() = child(PrefixApp::class) {}

fun RBuilder.prefix() {
    styledDiv {
        css { MentionsStyles.prefix }
        prefixApp()
    }
}
