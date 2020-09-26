package samples.carousel

import antd.carousel.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.fade() {
    styledDiv {
        css { +CarouselStyles.fade }
        carousel {
            attrs.effect = "fade"
            div {
                h3 { +"1" }
            }
            div {
                h3 { +"2" }
            }
            div {
                h3 { +"3" }
            }
            div {
                h3 { +"4" }
            }
        }
    }
}
