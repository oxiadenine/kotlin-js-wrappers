package samples.slider

import react.*
import react.dom.*

class SliderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Slider" }
        div {
            basic()
            iconSlider()
            event()
            vertical()
            inputNumber()
            tipFormatter()
            mark()
            showTooltip()
        }
    }
}

fun RBuilder.sliderApp() = child(SliderApp::class) {}
