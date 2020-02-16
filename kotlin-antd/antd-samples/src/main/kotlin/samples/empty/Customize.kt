package samples.empty

import antd.button.button
import antd.empty.empty
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import react.dom.span

fun RBuilder.customize() {
    div("empty-container") {
        attrs.id = "empty-customize"
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
