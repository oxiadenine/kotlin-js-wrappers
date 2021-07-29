package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import kotlinx.browser.window
import kotlinx.css.height
import kotlinx.css.marginRight
import kotlinx.css.px
import kotlinx.css.width
import react.*
import react.dom.attrs
import react.dom.span
import styled.css
import styled.styledDiv
import styled.styledImg

external interface AsyncMentionState : State {
    var search: String
    var loading: Boolean
    var users: Array<dynamic>
}

class AsyncMention : RComponent<RProps, AsyncMentionState>() {
    private val handleSearch: (String, String) -> Unit = { text, _ ->
        setState {
            search = text
            loading = text.toBoolean()
            users = emptyArray()
        }

        console.log("Search: ", text)

        loadGithubUsers(text)
    }

    private fun loadGithubUsers(key: String?) {
        if (key == null) {
            setState {
                users = emptyArray()
            }

            return
        }

        window.fetch("https://api.github.com/search/users?q=$key")
            .then { res -> res.json() }
            .then { json ->
                val items = json.asDynamic()["items"]?.unsafeCast<Array<Any>>()?.slice(0..10)?.toTypedArray()
                    ?: emptyArray()

                if (state.search != key) return@then

                console.log(items)

                setState {
                    users = items
                    loading = false
                }
            }
    }

    override fun AsyncMentionState.init() {
        search = ""
        loading = false
        users = emptyArray()
    }

    override fun RBuilder.render() {
        mentions {
            attrs {
                style = js { width = "100%" }
                loading = state.loading
                onSearch = handleSearch
            }
            state.users.map {
                option {
                    attrs {
                        key = it["login"] as String
                        value = it["login"] as String
                        className = "antd-demo-dynamic-option"
                    }
                    styledImg {
                        css {
                            width = 20.px
                            height = 20.px
                            marginRight = 8.px
                        }
                        attrs {
                            src = it["avatar_url"] as String
                            alt = it["login"] as String
                        }
                    }
                    span { +"${it["login"]}" }
                }
            }.toTypedArray()
        }
    }
}

fun RBuilder.asyncMention() = child(AsyncMention::class) {}

fun RBuilder.async() {
    styledDiv {
        css { MentionsStyles.async }
        asyncMention()
    }
}
