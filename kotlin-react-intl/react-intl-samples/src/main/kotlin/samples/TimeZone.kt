package samples

import react.*
import react.dom.*
import reactintl.datetime.IntlDateTimeFormatPart
import reactintl.provider.intlProvider
import reactintl.datetime.formattedDate
import reactintl.datetime.formattedDateParts
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
            br {}
            formattedDateParts {
                attrs {
                    value = Date(1459832991883)
                    year = "numeric"
                    month = "long"
                    day = "2-digit"
                }
                childList.add(fun (parts: Array<IntlDateTimeFormatPart>): ReactElement {
                    return span {
                        b { +parts[0].value }
                        +parts[1].value
                        small { +parts[2].value }
                    }
                })
            }
        }
    }
}

fun RBuilder.timeZone() {
    child(app) {
        attrs.currentTime = Date()
    }
}
