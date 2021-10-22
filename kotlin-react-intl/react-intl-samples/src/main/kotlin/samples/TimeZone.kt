package samples

import react.*
import react.dom.*
import reactintl.components.datetime.IntlDateTime
import reactintl.components.datetime.formattedDate
import reactintl.components.datetime.formattedDateParts
import reactintl.components.datetime.formattedTime
import reactintl.components.provider.intlProvider
import kotlin.js.*

external interface TimeZoneProps : Props {
    var currentTime: Any? /* Date | Number */
}

private val app = fc<TimeZoneProps> { props ->
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
                childList += fun(parts: Array<IntlDateTime.DateTimeFormatPart>): ReactElement {
                    return buildElement {
                        span {
                            b { +parts[0].value }
                            +parts[1].value
                            small { +parts[2].value }
                        }
                    }
                }.unsafeCast<ReactNode>()
            }
        }
    }
}

fun RBuilder.timeZone() = child(app) {
    attrs.currentTime = Date()
}
