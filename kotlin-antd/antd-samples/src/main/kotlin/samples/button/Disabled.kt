package samples.button

import antd.button.button
import kotlinx.css.background
import kotlinx.css.padding
import kotlinx.css.px
import kotlinx.css.rgb
import react.RBuilder
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.disabled() {
    styledDiv {
        css { +ButtonStyles.disabled }
        div {
            button {
                attrs.type = "primary"
                +"Primary"
            }
            button {
                attrs {
                    type = "primary"
                    disabled = true
                }
                +"Primary(disabled)"
            }
            br {}
            button { +"Default" }
            button {
                attrs.disabled = true
                +"Default(disabled)"
            }
            br {}
            button {
                attrs.type = "dashed"
                +"Dashed"
            }
            button {
                attrs {
                    type = "dashed"
                    disabled = true
                }
                +"Dashed(disabled)"
            }
            button {
                attrs.type = "link"
                +"Link"
            }
            button {
                attrs {
                    type = "link"
                    disabled = true
                }
                +"Link(disabled)"
            }
            styledDiv {
                css {
                    padding(8.px)
                    background = rgb(190, 200, 200).toString()
                }
                button {
                    attrs.ghost = true
                    +"Ghost"
                }
                button {
                    attrs {
                        ghost = true
                        disabled = true
                    }
                    +"Ghost(disabled)"
                }
            }
        }
    }
}
