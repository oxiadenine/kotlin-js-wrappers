package samples.radio

import antd.radio.radio
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.basic() {
    div("radio-container") {
        attrs.id = "radio-basic"
        radio { +"Radio" }
    }
}
