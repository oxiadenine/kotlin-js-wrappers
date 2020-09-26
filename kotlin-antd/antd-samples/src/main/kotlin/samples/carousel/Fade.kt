package samples.carousel

import antd.carousel.carousel
import react.RBuilder
import react.dom.div
import react.dom.h3
import styled.css
import styled.styledDiv

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
