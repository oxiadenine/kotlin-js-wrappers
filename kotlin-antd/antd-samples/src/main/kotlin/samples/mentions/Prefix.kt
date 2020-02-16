package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface PrefixAppState : RState {
    var prefix: String
}

class PrefixApp : RComponent<RProps, PrefixAppState>() {
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
            val options = (mockData[state.prefix] as Array<String>? ?: emptyArray()).map {
                option {
                    attrs {
                        key = it
                        value = it
                    }
                    +it
                }
            }.toTypedArray()

            childList.add(options)
        }
    }
}

fun RBuilder.prefixApp() = child(PrefixApp::class) {}

fun RBuilder.prefix() {
    div("mentions-container") {
        attrs.id = "mentions-prefix"
        prefixApp()
    }
}
