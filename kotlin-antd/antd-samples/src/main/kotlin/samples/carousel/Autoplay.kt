package samples.carousel

import antd.carousel.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.autoplay() {
    styledDiv {
        css { +CarouselStyles.autoplay }
        carousel {
            attrs.autoplay = true
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
