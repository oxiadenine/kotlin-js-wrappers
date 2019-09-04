package samples.carousel

import antd.carousel.carousel
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.div
import react.dom.h3

interface PositionCarouselDemoState : RState {
    var dotPosition: String
}

class PositionCarouselDemo : RComponent<RProps, PositionCarouselDemoState>() {
    private val handlePositionChange: (RadioChangeEvent) -> Unit = { e ->
        val value = e.target.value.unsafeCast<String>()

        setState {
            dotPosition = value
        }
    }

    override fun PositionCarouselDemoState.init() {
        dotPosition = "top"
    }

    override fun RBuilder.render() {
        div {
            radioGroup {
                attrs {
                    onChange = handlePositionChange
                    value = state.dotPosition
                    style = js { msrginBottom = 8 }
                }
                radioButton {
                    attrs.value = "top"
                    +"Top"
                }
                radioButton {
                    attrs.value = "bottom"
                    +"Bottom"
                }
                radioButton {
                    attrs.value = "left"
                    +"Left"
                }
                radioButton {
                    attrs.value = "right"
                    +"Right"
                }
            }
            carousel {
                attrs.dotPosition = state.dotPosition
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
}

fun RBuilder.positionCarouselDemo() = child(PositionCarouselDemo::class) {}

fun RBuilder.position() {
    div("carousel-container") {
        attrs.id = "carousel-position"
        positionCarouselDemo()
    }
}
