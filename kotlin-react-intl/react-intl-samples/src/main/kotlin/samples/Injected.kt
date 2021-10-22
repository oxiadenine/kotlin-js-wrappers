package samples

import kotlinext.js.*
import react.*
import react.dom.*
import reactintl.*
import reactintl.components.WrappedComponentProps
import reactintl.components.injectIntl
import reactintl.components.provider.intlProvider
import reactintl.components.useIntl
import kotlin.js.Date

private val comp = fc<Props> {
    val formatDate = useIntl()

    h1 { +formatDate.formatDate(Date.now()) }
}

external interface Comp2Props : WrappedComponentProps<Any> {
    var intl: IntlShape
}

private val comp2 = fc<Comp2Props> { props ->
    h1 { +props.intl.formatDate(Date.now(), jsObject { month = "long" }) }
    h2 { +props.intl.formatTime(Date()) }
}

fun RBuilder.comp2WithIntl(handler: RHandler<Comp2Props>) =
    child(injectIntl<Any, Comp2Props>(comp2), jsObject {}, handler)

private val app = fc<Props> {
    intlProvider {
        attrs {
            locale = "en"
            timeZone = "Asia/Tokyo"
        }
        div {
            child(comp)
            comp2WithIntl {}
        }
    }
}

fun RBuilder.injected() = child(app)
