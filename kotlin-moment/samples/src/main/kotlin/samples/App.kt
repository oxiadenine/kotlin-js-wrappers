package samples

import moment.moment
import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-container") {
            h1 { +"Samples" }
            div("samples-content") {
                h2 { +"Format Dates" }
                div("samples-code-box") {
                    div("samples-code") {
                        +"moment().format('MMMM Do YYYY, h:mm:ss a')"
                        span { +moment().format("MMMM Do YYYY, h:mm:ss a") }
                    }
                    div("samples-code") {
                        +"moment().format('dddd')"
                        span { +moment().format("dddd") }
                    }
                    div("samples-code") {
                        +"moment().format('MMM Do YY')"
                        span { +moment().format("MMM Do YY") }
                    }
                    div("samples-code") {
                        +"moment().format('YYYY [escaped] YYYY')"
                        span { +moment().format("YYYY [escaped] YYYY") }
                    }
                    div("samples-code") {
                        +"moment().format()"
                        span { +moment().format() }
                    }
                }
            }
            div("samples-content") {
                h2 { +"Relative Time" }
                div("samples-code-box") {
                    div("samples-code") {
                        +"moment('20111031', 'YYYYMMDD').fromNow()"
                        span { +moment("20111031", "YYYYMMDD").fromNow() }
                    }
                    div("samples-code") {
                        +"moment('20120620', 'YYYYMMDD').fromNow()"
                        span { +moment("20120620", "YYYYMMDD").fromNow() }
                    }
                    div("samples-code") {
                        +"moment().startOf('day').fromNow()"
                        span { +moment().startOf("day").fromNow() }
                    }
                    div("samples-code") {
                        +"moment().endOf('day').fromNow()"
                        span { +moment().endOf("day").fromNow() }
                    }
                    div("samples-code") {
                        +"moment().startOf('hour').fromNow()"
                        span { +moment().startOf("hour").fromNow() }
                    }
                }
            }
            div("samples-content") {
                h2 { +"Calendar Time" }
                div("samples-code-box") {
                    div("samples-code") {
                        +"moment().subtract(10, 'days').calendar()"
                        span { +moment().subtract(10, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().subtract(6, 'days').calendar()"
                        span { +moment().subtract(6, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().subtract(3, 'days').calendar()"
                        span { +moment().subtract(3, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().subtract(1, 'days').calendar()"
                        span { +moment().subtract(1, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().calendar()"
                        span { +moment().calendar() }
                    }
                    div("samples-code") {
                        +"moment().add(1, 'days').calendar()"
                        span { +moment().add(1, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().add(3, 'days').calendar()"
                        span { +moment().add(3, "days").calendar() }
                    }
                    div("samples-code") {
                        +"moment().add(10, 'days').calendar()"
                        span { +moment().add(10, "days").calendar() }
                    }
                }
            }
            div("samples-content") {
                h2 { +"Multiple Locale Support" }
                div("samples-code-box") {
                    div("samples-code") {
                        +"moment().locale()"
                        span { +moment().locale() }
                    }
                    div("samples-code") {
                        +"moment().format('LT')"
                        span { +moment().format("LT") }
                    }
                    div("samples-code") {
                        +"moment().format('LTS')"
                        span { +moment().format("LTS") }
                    }
                    div("samples-code") {
                        +"moment().format('L') "
                        span { +moment().format("L")  }
                    }
                    div("samples-code") {
                        +"moment().format('l')"
                        span { +moment().format("l") }
                    }
                    div("samples-code") {
                        +"moment().format('LL')"
                        span { +moment().format("LL") }
                    }
                    div("samples-code") {
                        +"moment().format('ll')"
                        span { +moment().format("ll") }
                    }
                    div("samples-code") {
                        +"moment().format('LLL')"
                        span { +moment().format("LLL") }
                    }
                    div("samples-code") {
                        +"moment().format('lll')"
                        span { +moment().format("lll") }
                    }
                    div("samples-code") {
                        +"moment().format('LLLL')"
                        span { +moment().format("LLLL") }
                    }
                    div("samples-code") {
                        +"moment().format('llll')"
                        span { +moment().format("llll") }
                    }
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) { }
