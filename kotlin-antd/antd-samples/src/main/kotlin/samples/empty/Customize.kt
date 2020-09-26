package samples.empty

import antd.button.button
import antd.empty.*
import kotlinext.js.*
import react.*
import react.dom.a
import react.dom.span
import styled.*

fun RBuilder.customize() {
    styledDiv {
        css { +EmptyStyles.customize }
        empty {
            attrs {
                image = "https://gw.alipayobjects.com/mdn/miniapp_social/afts/img/A*pevERLJC9v0AAAAAAAAAAABjAQAAAQ/original"
                imageStyle = js { hegiht = 40 }
                description = buildElement {
                    span {
                        +"Customize "
                        a {
                            attrs.href = "#API"
                            +"Description"
                        }
                    }
                }
            }
            button {
                attrs.type = "primary"
                +"Description"
            }
        }
    }
}
