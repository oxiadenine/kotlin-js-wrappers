package samples

import moment.moment
import react.RBuilder
import react.dom.h2
import react.dom.span
import styled.css
import styled.styledDiv

fun RBuilder.calendarTime() {
    h2 { +"Calendar Time" }
    styledDiv {
        css { +AppStyles.codeBox }
        styledDiv {
            css { +AppStyles.code }
            +"moment().subtract(10, 'days').calendar()"
            span { +moment().subtract(10, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().subtract(6, 'days').calendar()"
            span { +moment().subtract(6, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().subtract(3, 'days').calendar()"
            span { +moment().subtract(3, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().subtract(1, 'days').calendar()"
            span { +moment().subtract(1, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().calendar()"
            span { +moment().calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().add(1, 'days').calendar()"
            span { +moment().add(1, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().add(3, 'days').calendar()"
            span { +moment().add(3, "days").calendar() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().add(10, 'days').calendar()"
            span { +moment().add(10, "days").calendar() }
        }
    }
}
