package samples.carousel

import antd.carousel.carousel
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.h3

fun RBuilder.fade() {
    div("carousel-container") {
        attrs.id = "carousel-fade"
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
