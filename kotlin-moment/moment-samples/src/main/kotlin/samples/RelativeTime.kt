package samples

import moment.moment
import react.RBuilder
import react.dom.div
import react.dom.h2
import react.dom.span

fun RBuilder.relativeTime() {
    div("app-content") {
        h2 { +"Relative Time" }
        div("app-code-box") {
            div("app-code") {
                +"moment('20111031', 'YYYYMMDD').fromNow()"
                span { +moment("20111031", "YYYYMMDD").fromNow() }
            }
            div("app-code") {
                +"moment('20120620', 'YYYYMMDD').fromNow()"
                span { +moment("20120620", "YYYYMMDD").fromNow() }
            }
            div("app-code") {
                +"moment().startOf('day').fromNow()"
                span { +moment().startOf("day").fromNow() }
            }
            div("app-code") {
                +"moment().endOf('day').fromNow()"
                span { +moment().endOf("day").fromNow() }
            }
            div("app-code") {
                +"moment().startOf('hour').fromNow()"
                span { +moment().startOf("hour").fromNow() }
            }
        }
    }
}
