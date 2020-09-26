package samples

import moment.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.formatDate() {
    h2 { +"Format Dates" }
    styledDiv {
        css { +AppStyles.codeBox }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('MMMM Do YYYY, h:mm:ss a')"
            span { +moment().format("MMMM Do YYYY, h:mm:ss a") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('dddd')"
            span { +moment().format("dddd") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('MMM Do YY')"
            span { +moment().format("MMM Do YY") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('YYYY [escaped] YYYY')"
            span { +moment().format("YYYY [escaped] YYYY") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format()"
            span { +moment().format() }
        }
    }
}
