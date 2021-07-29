package samples.button

import antd.button.button
import kotlinx.css.background
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.rgb
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.ghost() {
    styledDiv {
        css { +ButtonStyles.ghost }
        styledDiv {
            css {
                background = rgb(190, 200, 200).toString()
                padding(26.px, 16.px, 16.px)
            }
            button {
                attrs {
                    type = "primary"
                    ghost = true
                }
                +"Primary"
            }
            button {
                attrs.ghost = true
                +"Default"
            }
            button {
                attrs {
                    type = "dashed"
                    ghost = true
                }
                +"Dashed"
            }
            button {
                attrs {
                    type = "danger"
                    ghost = true
                }
                +"Danger"
            }
            button {
                attrs {
                    type = "link"
                    ghost = true
                }
                +"Link"
            }
        }
    }
}
