package samples.sandbox

import react.*
import react.dom.*
import reactresponsive.*

class Sandbox : RComponent<Props, State>() {
    override fun RBuilder.render() {
        div {
            div { +"Device Test!" }
            mediaQuery {
                attrs.minDeviceWidth = 1224
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

fun RBuilder.sandbox() = child(Sandbox::class) {}
