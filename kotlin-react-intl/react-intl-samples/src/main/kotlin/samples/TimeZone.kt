package samples

import react.*
import react.dom.*
import reactintl.provider.intlProvider
import reactintl.datetime.formattedDate
import reactintl.datetime.formattedTime
import kotlin.js.Date

interface TimeZoneProps : RProps {
    var currentTime: Any /* Date | Number */
}

private val app = functionalComponent<TimeZoneProps> { props ->
    intlProvider {
        attrs {
            locale = "en"
            timeZone = "Asia/Tokyo"
        }
        p {
            +"The date in Tokyo is: "
            formattedDate {
                attrs.value = props.currentTime
            }
            br {}
            +"The time in Tokyo is: "
            formattedTime {
                attrs.value = props.currentTime
            }
        }
    }
}

fun RBuilder.timeZone() {
    child(app) {
        attrs.currentTime = Date()
    }
}
