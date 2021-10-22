package samples

import kotlinx.browser.window
import kotlinx.html.js.onClickFunction
import kotlinx.html.title
import react.Props
import react.RBuilder
import react.dom.*
import react.fc
import react.useState
import reactintl.components.provider.intlProvider
import reactintl.components.relativetime.formattedRelativeTime
import reactintl.components.useIntl
import kotlin.js.Date

private fun getRelativeTime(date: Date): Number {
    return (date.getTime() - Date().getTime()) / 1000
}

external interface PostDateProps : Props {
    var date: Date
}

private val postDate = fc<PostDateProps> { props ->
    val intl = useIntl()

    span {
        attrs.title = intl.formatDate(props.date)
        formattedRelativeTime {
            attrs {
                value = getRelativeTime(props.date)
                updateIntervalInSeconds = 1
            }
        }
    }
}

private val app = fc<Props> {
    val (hide, setHide) = useState(false)

    intlProvider {
        attrs.locale = window.navigator.language
        div {
            h1 { +"Hello world" }
            if (!hide) {
                p {
                    postDate { attrs.date = Date() }
                }
            }
            button {
                attrs.onClickFunction = {
                    setHide { current -> !current }
                }
                +"Toggle FormattedRelativeTime"
            }
        }
    }
}

fun RBuilder.bug272() = child(app)
