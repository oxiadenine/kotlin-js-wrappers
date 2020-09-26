package samples.carousel

import antd.carousel.*
import react.*
import react.dom.*
import styled.*

private fun onChange(currentSlide: Number) {
    console.log(currentSlide)
}

fun RBuilder.basic() {
    styledDiv {
        css { +CarouselStyles.basic }
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
