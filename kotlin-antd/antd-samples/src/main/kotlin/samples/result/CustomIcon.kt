package samples.result

import antd.button.*
import antd.icon.*
import antd.result.*
import react.*
import styled.*

fun RBuilder.customIcon() {
    styledDiv {
        css { +ResultStyles.customIcon }
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
