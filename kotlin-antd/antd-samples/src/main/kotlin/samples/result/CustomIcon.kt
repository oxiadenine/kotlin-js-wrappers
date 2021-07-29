package samples.result

import antd.button.button
import antd.icon.smileTwoTone
import antd.result.result
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

fun RBuilder.customIcon() {
    styledDiv {
        css { +ResultStyles.customIcon }
        result {
            attrs {
                icon = buildElement {
                    smileTwoTone {}
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
