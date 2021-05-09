package samples

import kotlinext.js.*
import react.*
import react.dom.*
import reactresponsive.*

private val example = functionalComponent<RProps> {
    div {
        div { +"Device Test!" }
        mediaQuery {
            attrs {
                minDeviceWidth = 1224
                device = jsObject { deviceWidth = 1600 }
            }
            p { +"You are a desktop or laptop" }
            mediaQuery {
                attrs.minDeviceWidth = 1824
                p { +"You also have a huge screen" }
            }
        }
        mediaQuery {
            attrs.minResolution = "2dppx"
            childList += fun(matches: Boolean): ReactElement {
                return if (matches) {
                    p { +"You are retina" }
                } else p { +"You are not retina" }
            }
        }
    }
}

fun RBuilder.withComponents() = child(example)
