package samples.switch

import antd.switch.switch
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.loading() {
    styledDiv {
        css { +SwitchStyles.loading }
        div {
            switch {
                attrs {
                    loading = true
                    defaultChecked = true
                }
            }
            br {}
            switch {
                attrs {
                    size = "small"
                    loading = true
                }
            }
        }
    }
}
