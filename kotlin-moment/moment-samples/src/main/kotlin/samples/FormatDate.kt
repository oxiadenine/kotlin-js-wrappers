package samples

import moment.moment
import react.RBuilder
import react.dom.div
import react.dom.h2
import react.dom.span

fun RBuilder.formatDate() {
    div("app-content") {
        h2 { +"Format Dates" }
        div("app-code-box") {
            div("app-code") {
                +"moment().format('MMMM Do YYYY, h:mm:ss a')"
                span { +moment().format("MMMM Do YYYY, h:mm:ss a") }
            }
            div("app-code") {
                +"moment().format('dddd')"
                span { +moment().format("dddd") }
            }
            div("app-code") {
                +"moment().format('MMM Do YY')"
                span { +moment().format("MMM Do YY") }
            }
            div("app-code") {
                +"moment().format('YYYY [escaped] YYYY')"
                span { +moment().format("YYYY [escaped] YYYY") }
            }
            div("app-code") {
                +"moment().format()"
                span { +moment().format() }
            }
        }
    }
}
