package samples.select

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.spin.spin
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*
import kotlin.browser.window

interface UserRemoteSelectState : RState {
    var data: Array<Any>
    var value: Array<Any>
    var fetching: Boolean
}

class UserRemoteSelect : RComponent<RProps, UserRemoteSelectState>() {
    private var lastFetchId = 0

    private val fetchUser = fun (value: String) {
        console.log("fetching user", value)

        lastFetchId = lastFetchId++

        val fetchId = lastFetchId

        setState {
            data = emptyArray()
            fetching = true
        }

        window.fetch("https://randomuser.me/api/?results=5")
                .then { res -> res.json() }
                .then { body ->
                    if (fetchId == lastFetchId) { // for fetch callback order
                        val userData = body.asDynamic().results.unsafeCast<Array<Any>>().map { user ->
                            js {
                                name = "${user.asDynamic().name.first} ${user.asDynamic().name.last}"
                                username = user.asDynamic().login.username.unsafeCast<String>()
                            }.unsafeCast<Any>()
                        }.toTypedArray()

                        setState {
                            data = userData
                            fetching = false
                        }
                    }
                }
    }

    private val handleChange = fun (newValue: Array<Any>, _: Any) {
        setState {
            value = newValue
            data = emptyArray()
            fetching = false
        }
    }

    override fun UserRemoteSelectState.init() {
        data = emptyArray()
        value = emptyArray()
        fetching = false
    }

    override fun RBuilder.render() {
        select<Array<Any>, SelectComponent<Array<Any>>> {
            attrs {
                mode = "multiple"
                labelInValue = true
                value = state.value
                placeholder = "Select users"
                notFoundContent = if (state.fetching) {
                    buildElement {
                        spin {
                            attrs.size = "small"
                        }
                    }
                } else null
                filterOption = false
                onSearch = fetchUser
                onChange = handleChange
                style = js { width = "100%" }
            }
            childList.add(state.data.map { d ->
                buildElement {
                    option {
                        attrs.key = d.asDynamic().username.unsafeCast<String>()
                        +d.asDynamic().name.unsafeCast<String>()
                    }
                }
            }.toTypedArray())
        }
    }
}

fun RBuilder.userRemoteSelect() = child(UserRemoteSelect::class) {}

fun RBuilder.selectUsers() {
    div("select-container") {
        attrs.id = "select-select-users"
        userRemoteSelect()
    }
}
