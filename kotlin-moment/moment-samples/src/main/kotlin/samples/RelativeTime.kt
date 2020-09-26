package samples

import moment.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.relativeTime() {
    h2 { +"Relative Time" }
    styledDiv {
        css { +AppStyles.codeBox }
        styledDiv {
            css { +AppStyles.code }
            +"moment('20111031', 'YYYYMMDD').fromNow()"
            span { +moment("20111031", "YYYYMMDD").fromNow() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment('20120620', 'YYYYMMDD').fromNow()"
            span { +moment("20120620", "YYYYMMDD").fromNow() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().startOf('day').fromNow()"
            span { +moment().startOf("day").fromNow() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().endOf('day').fromNow()"
            span { +moment().endOf("day").fromNow() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().startOf('hour').fromNow()"
            span { +moment().startOf("hour").fromNow() }
        }
    }
}
