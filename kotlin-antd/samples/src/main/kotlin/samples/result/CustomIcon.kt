package samples.result

import antd.button.button
import antd.icon.icon
import antd.result.result
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div

fun RBuilder.customIcon() {
    div("result-container") {
        attrs.id = "result-custom-icon"
        result {
            attrs {
                icon = buildElement {
                    icon {
                        attrs {
                            type = "smile"
                            theme = "twoTone"
                        }
                    }
                }
                title = "Great, we have done all the operations!"
                extra = buildElement {
                    button {
                        attrs.type = "primary"
                        +"Next"
                    }
                }
            }
        }
    }
}
