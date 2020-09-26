package samples.mentions

import antd.mentions.*
import kotlinext.js.*
import react.*
import styled.*

fun RBuilder.placement() {
    styledDiv {
        css { MentionsStyles.placement }
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
