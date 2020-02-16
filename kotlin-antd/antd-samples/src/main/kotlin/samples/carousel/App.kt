package samples.carousel

import react.*
import react.dom.*

class CarouselApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Carousel" }
        div {
            basic()
            autoplay()
            position()
            fade()
        }
    }
}

fun RBuilder.carouselApp() = child(CarouselApp::class) {}
