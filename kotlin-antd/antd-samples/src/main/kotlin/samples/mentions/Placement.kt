package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import react.RBuilder
import styled.css
import styled.styledDiv

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
