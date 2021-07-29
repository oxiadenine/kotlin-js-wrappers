package samples.input

import antd.input.search
import kotlinext.js.js
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

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
