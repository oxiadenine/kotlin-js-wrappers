package samples

import kotlinx.js.jso
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.p
import reactresponsive.*

val WithHooks = FC<Props> {
    val isDesktopOrLaptop = useMediaQuery(jso {
        query = "(min-device-width: 1224px)"
    })
    val isBigScreen = useMediaQuery(jso { query = "(min-device-width: 1824px)" })
    val isTabletOrMobile = useMediaQuery(jso { query = "(max-width: 1224px)" })
    val isTabletOrMobileDevice = useMediaQuery(jso {
        query = "(max-device-width: 1224px)"
    })
    val isPortrait = useMediaQuery(jso { query = "(orientation: portrait)" })
    val isRetina = useMediaQuery(jso { query = "(min-resolution: 2dppx)" })

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
