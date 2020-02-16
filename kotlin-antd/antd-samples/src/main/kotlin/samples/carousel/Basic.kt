package samples.carousel

import antd.carousel.carousel
import kotlinx.html.id
import react.RBuilder
import react.dom.div
import react.dom.h3

private fun onChange(currentSlide: Number) {
    console.log(currentSlide)
}

fun RBuilder.basic() {
    div("carousel-container") {
        attrs.id = "carousel-basic"
        carousel {
            attrs.afterChange = ::onChange
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
