package samples.sandbox

import kotlinext.js.jsObject
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import reactresponsive.mediaQuery

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div {
            div { +"Device Test!" }
            mediaQuery {
                attrs {
                    minDeviceWidth = 1224
                    values = jsObject { deviceWidth = 1230 }
                }
                div { +"You are a desktop or laptop" }
                mediaQuery {
                    attrs.minDeviceWidth = 1824
                    div { +"You also have a huge screen" }
                }
                mediaQuery {
                    attrs.maxWidth = 1224
                    div { +"You are sized like a tablet or mobile phone though" }
                }
            }
            mediaQuery {
                attrs.maxDeviceWidth = 1224
                div { +"You are a tablet or mobile phone" }
            }

            mediaQuery {
                attrs.orientation = "portrait"
                div { +"You are portrait" }
            }
            mediaQuery {
                attrs.orientation = "landscape"
                div { +"You are landscape" }
            }
            mediaQuery {
                attrs.minResolution = "2dppx"
                div { +"You are retina" }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}

fun RBuilder.sandbox() {
    app()
}
