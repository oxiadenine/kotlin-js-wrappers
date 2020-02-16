package samples

import moment.moment
import react.RBuilder
import react.dom.div
import react.dom.h2
import react.dom.span

fun RBuilder.calendarTime() {
    div("app-content") {
        h2 { +"Calendar Time" }
        div("app-code-box") {
            div("app-code") {
                +"moment().subtract(10, 'days').calendar()"
                span { +moment().subtract(10, "days").calendar() }
            }
            div("app-code") {
                +"moment().subtract(6, 'days').calendar()"
                span { +moment().subtract(6, "days").calendar() }
            }
            div("app-code") {
                +"moment().subtract(3, 'days').calendar()"
                span { +moment().subtract(3, "days").calendar() }
            }
            div("app-code") {
                +"moment().subtract(1, 'days').calendar()"
                span { +moment().subtract(1, "days").calendar() }
            }
            div("app-code") {
                +"moment().calendar()"
                span { +moment().calendar() }
            }
            div("app-code") {
                +"moment().add(1, 'days').calendar()"
                span { +moment().add(1, "days").calendar() }
            }
            div("app-code") {
                +"moment().add(3, 'days').calendar()"
                span { +moment().add(3, "days").calendar() }
            }
            div("app-code") {
                +"moment().add(10, 'days').calendar()"
                span { +moment().add(10, "days").calendar() }
            }
        }
    }
}
