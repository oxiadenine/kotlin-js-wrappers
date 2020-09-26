package samples.input

import antd.input.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.searchInput() {
    styledDiv {
        css { +InputStyles.searchInput }
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
