package samples.affix

import antd.affix.affix
import antd.button.button
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.onChange() {
    div("affix-container") {
        attrs.id = "affix-on-change"
        affix {
            attrs {
                offsetTop = 120
                onChange = { affixed -> console.log(affixed) }
            }
            button { +"120px to affix top" }
        }
    }
}
