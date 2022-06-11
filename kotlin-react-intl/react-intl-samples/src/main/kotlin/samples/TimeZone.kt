package samples

import react.*
import react.dom.html.ReactHTML.b
import react.dom.html.ReactHTML.br
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.small
import react.dom.html.ReactHTML.span
import reactintl.components.datetime.IntlDateTime
import reactintl.components.datetime.FormattedDate
import reactintl.components.datetime.FormattedDateParts
import reactintl.components.datetime.FormattedTime
import reactintl.components.provider.IntlProvider
import kotlin.js.*

external interface TimeZoneProps : Props {
    var currentTime: Any? /* Date | Number */
}

val TimeZone = FC<TimeZoneProps> { props ->
    IntlProvider {
        locale = "en"
        timeZone = "Asia/Tokyo"
        p {
            +"The date in Tokyo is: "
            FormattedDate {
                value = props.currentTime
            }
            br {}
            +"The time in Tokyo is: "
            FormattedTime {
                value = props.currentTime
            }
            br {}
            FormattedDateParts {
                value = Date(1459832991883)
                year = "numeric"
                month = "long"
                day = "2-digit"
                children = fun(parts: Array<IntlDateTime.DateTimeFormatPart>): ReactNode {
                    return span.create {
                        b { +parts[0].value }
                        +parts[1].value
                        small { +parts[2].value }
                    }
                }
            }
        }
    }
}