package samples

import moment.moment
import react.RBuilder
import react.dom.div
import react.dom.h2
import react.dom.span

fun RBuilder.multipleLocale() {
    div("app-content") {
        h2 { +"Multiple Locale Support" }
        div("app-code-box") {
            div("app-code") {
                +"moment().locale()"
                span { +moment().locale() }
            }
            div("app-code") {
                +"moment().format('LT')"
                span { +moment().format("LT") }
            }
            div("app-code") {
                +"moment().format('LTS')"
                span { +moment().format("LTS") }
            }
            div("app-code") {
                +"moment().format('L') "
                span { +moment().format("L")  }
            }
            div("app-code") {
                +"moment().format('l')"
                span { +moment().format("l") }
            }
            div("app-code") {
                +"moment().format('LL')"
                span { +moment().format("LL") }
            }
            div("app-code") {
                +"moment().format('ll')"
                span { +moment().format("ll") }
            }
            div("app-code") {
                +"moment().format('LLL')"
                span { +moment().format("LLL") }
            }
            div("app-code") {
                +"moment().format('lll')"
                span { +moment().format("lll") }
            }
            div("app-code") {
                +"moment().format('LLLL')"
                span { +moment().format("LLLL") }
            }
            div("app-code") {
                +"moment().format('llll')"
                span { +moment().format("llll") }
            }
        }
    }
}
