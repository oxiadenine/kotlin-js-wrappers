package samples.checkbox

import antd.checkbox.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.disabled() {
    styledDiv {
        css { +CheckboxStyles.disabled }
        div {
            checkbox {
                attrs {
                    defaultChecked = false
                    disabled = true
                }
            }
            br {}
            checkbox {
                attrs {
                    defaultChecked = true
                    disabled = true
                }
            }
        }
    }
}
