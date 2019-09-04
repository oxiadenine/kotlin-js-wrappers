package samples.input

import antd.input.search
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.searchInput() {
    div("input-container") {
        attrs.id = "input-search-input"
        div {
            search {
                attrs {
                    placeholder = "input search text"
                    onSearch = { value, _ -> console.log(value) }
                    style = js { width = 200 }
                }
            }
            br {}
            br {}
            search {
                attrs {
                    placeholder = "input search text"
                    onSearch = { value, _ -> console.log(value) }
                    enterButton = true
                }
            }
            br {}
            br {}
            search {
                attrs {
                    placeholder = "input search text"
                    enterButton = "Search"
                    size = "large"
                    onSearch = { value, _ -> console.log(value) }
                }
            }
        }
    }
}
