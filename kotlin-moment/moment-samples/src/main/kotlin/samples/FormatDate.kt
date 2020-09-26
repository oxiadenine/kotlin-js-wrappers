package samples

import moment.moment
import react.RBuilder
import react.dom.h2
import react.dom.span
import styled.css
import styled.styledDiv

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
