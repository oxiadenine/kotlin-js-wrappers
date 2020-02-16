package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.placement() {
    div("mentions-container") {
        attrs.id = "mentions-placement"
        mentions {
            attrs {
                style = js { width = "100%" }
                placement = "top"
            }
            option {
                attrs.value = "afc163"
                +"afc163"
            }
            option {
                attrs.value = "zombieJ"
                +"zombieJ"
            }
            option {
                attrs.value = "yesmeck"
                +"yesmeck"
            }
        }
    }
}
