package samples.radio

import antd.radio.*
import react.*
import styled.*

fun RBuilder.radioGroupWithNameApp() {
    radioGroup {
        attrs {
            name = "radiogroup"
            defaultValue = 1
        }
        radio {
            attrs.value = 1
            +"A"
        }
        radio {
            attrs.value = 2
            +"B"
        }
        radio {
            attrs.value = 3
            +"C"
        }
        radio {
            attrs.value = 4
            +"D"
        }
    }
}

fun RBuilder.radioGroupWithName() {
    styledDiv {
        css { +RadioStyles.radioGroupWithName }
        radioGroupWithNameApp()
    }
}
