package samples

import react.*
import react.dom.br
import react.dom.p
import reactintl.provider.intlProvider
import reactintl.date.formattedDate
import reactintl.time.formattedTime
import kotlin.js.Date

interface TimeZoneProps : RProps {
    var currentTime: Any /* Date | Number */
}

class TimeZone : RComponent<TimeZoneProps, RState>() {
    override fun RBuilder.render() {
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
}

fun RBuilder.timeZoneApp(handler: RHandler<TimeZoneProps>) = child(TimeZone::class, handler)

fun RBuilder.timeZone() {
    timeZoneApp {
        attrs.currentTime = Date()
    }
}
