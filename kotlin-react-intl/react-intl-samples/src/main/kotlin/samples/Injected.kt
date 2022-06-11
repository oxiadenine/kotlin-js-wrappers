package samples

import kotlinx.js.jso
import react.*
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h2
import reactintl.*
import reactintl.components.WrappedComponentProps
import reactintl.components.injectIntl
import reactintl.components.provider.IntlProvider
import reactintl.components.useIntl
import kotlin.js.Date

private val Comp = FC<Props> {
    val formatDate = useIntl()

    h1 { +formatDate.formatDate(Date.now()) }
}

external interface Comp2Props : WrappedComponentProps<Any> {
    var intl: IntlShape
}

private val Comp2 = FC<Comp2Props> { props ->
    h1 { +props.intl.formatDate(Date.now(), jso { month = "long" }) }
    h2 { +props.intl.formatTime(Date()) }
}

val Injected = FC<Props> {
    IntlProvider {
        locale = "en"
        timeZone = "Asia/Tokyo"
        div {
            child(Comp.create())
            child(injectIntl<Any, Comp2Props>(Comp2).create())
        }
    }
}