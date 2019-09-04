package samples.progress

import antd.progress.FromToGradients
import antd.progress.StringGradients
import antd.progress.progress
import kotlinext.js.jsObject
import kotlinx.html.id
import react.RBuilder
import react.dom.div

fun RBuilder.gradientLine() {
    div("progress-container") {
        attrs.id = "progress-gradient-line"
        div {
            progress {
                val gradient: dynamic = jsObject<StringGradients> {}

                gradient["0%"] = "#108ee9"
                gradient["100%"] = "#87d068"

                attrs {
                    strokeColor = gradient.unsafeCast<Any>()
                    percent = 99.9
                }
            }
            progress {
                attrs {
                    strokeColor = jsObject<FromToGradients> {
                        from = "#108ee9"
                        to = "#87d068"
                    }
                    percent = 99.9
                    status = "active"
                }
            }
        }
    }
}
