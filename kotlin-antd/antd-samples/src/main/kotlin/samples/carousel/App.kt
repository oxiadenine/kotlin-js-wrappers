package samples.carousel

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object CarouselStyles : StyleSheet("carousel", isStatic = true) {
    val container by css {
        descendants(".ant-carousel") {
            descendants(".slick-slide") {
                height = 160.px
                background = "#364d79"
                overflow = Overflow.hidden
                textAlign = TextAlign.center
                lineHeight = LineHeight("160px")
                descendants("h3") {
                    color = Color.white
                }
            }
        }
    }
    val basic by css {}
    val autoplay by css {}
    val position by css {}
    val fade by css {}
}

class CarouselApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Carousel" }
        styledDiv {
            css { +CarouselStyles.container }
            basic()
            autoplay()
            position()
            fade()
        }
    }
}

fun RBuilder.carouselApp() = child(CarouselApp::class) {}
