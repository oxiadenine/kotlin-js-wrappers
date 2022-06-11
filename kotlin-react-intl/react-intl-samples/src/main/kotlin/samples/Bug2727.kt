package samples

import kotlinx.browser.window
import react.*
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.p
import react.dom.html.ReactHTML.span
import reactintl.components.provider.IntlProvider
import reactintl.components.relativetime.FormattedRelativeTime
import reactintl.components.useIntl
import kotlin.js.Date

private fun getRelativeTime(date: Date): Number {
    return (date.getTime() - Date().getTime()) / 1000
}

external interface PostDateProps : Props {
    var date: Date
}

private val PostDate = FC<PostDateProps> { props ->
    val intl = useIntl()

    span {
        title = intl.formatDate(props.date)
        FormattedRelativeTime {
            value = getRelativeTime(props.date)
            updateIntervalInSeconds = 1
        }
    }
}

val Bug272 = FC<Props> {
    val (hide, setHide) = useState(false)

    IntlProvider {
        locale = window.navigator.language
        div {
            h1 { +"Hello world" }
            if (!hide) {
                p {
                    PostDate { date = Date() }
                }
            }
            button {
                onClick = {
                    setHide { current -> !current }
                }
                +"Toggle FormattedRelativeTime"
            }
        }
    }
}