package samples

import kotlinext.js.jsObject
import react.*
import react.dom.div
import react.dom.h1
import react.dom.p
import reactresponsive.useMediaQuery

private val example = functionalComponent<RProps> {
    val isDesktopOrLaptop = useMediaQuery(jsObject {
        query = "(min-device-width: 1224px)"
    })
    val isBigScreen = useMediaQuery(jsObject { query = "(min-device-width: 1824px)" })
    val isTabletOrMobile = useMediaQuery(jsObject { query = "(max-width: 1224px)" })
    val isTabletOrMobileDevice = useMediaQuery(jsObject {
            query = "(max-device-width: 1224px)"
    })
    val isPortrait = useMediaQuery(jsObject { query = "(orientation: portrait)" })
    val isRetina = useMediaQuery(jsObject { query = "(min-resolution: 2dppx)" })

    div {
        div { +"Device Test!" }
        if (isDesktopOrLaptop) {
            p { +"You are a desktop or laptop" }
            if (isBigScreen) {
                p { +"You also have a huge screen" }
            }
            if (isTabletOrMobile) {
                p { +"You are sized like a tablet or mobile phone though" }
            }
        }
        if (isTabletOrMobileDevice) {
            p { +"You are a tablet or mobile phone" }
        }
        p { +"You are in ${if (isPortrait) "portrait" else "landscape"} orientation" }
        if (isRetina) {
            p { +"You are retina" }
        }
    }
}

fun RBuilder.withHooks() = child(example)
