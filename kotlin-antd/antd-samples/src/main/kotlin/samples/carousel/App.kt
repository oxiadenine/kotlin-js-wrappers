package samples.carousel

import kotlinx.css.Color
import kotlinx.css.Overflow
import kotlinx.css.TextAlign
import kotlinx.css.background
import kotlinx.css.color
import kotlinx.css.height
import kotlinx.css.lineHeight
import kotlinx.css.overflow
import kotlinx.css.properties.LineHeight
import kotlinx.css.px
import kotlinx.css.textAlign
import react.*
import react.dom.*
import styled.StyleSheet
import styled.css
import styled.styledDiv

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
