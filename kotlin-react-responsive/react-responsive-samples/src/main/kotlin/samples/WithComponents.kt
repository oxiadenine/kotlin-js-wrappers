package samples

import kotlinext.js.*
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import reactresponsive.*

val WithComponents = FC<Props> {
    div {
        div { +"Device Test!" }
        MediaQuery {
            minDeviceWidth = 1224
            device = jso { deviceWidth = 1600 }
            p { +"You are a desktop or laptop" }
            MediaQuery {
                minDeviceWidth = 1824
                p { +"You also have a huge screen" }
            }
        }
        MediaQuery {
            minResolution = "2dppx"
            children = fun(matches: Boolean): ReactElement {
                return if (matches) {
                    p.create { +"You are retina" }
                } else p.create { +"You are not retina" }
            }
        }
    }
}
