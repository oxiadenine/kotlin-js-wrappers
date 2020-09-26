package samples

import moment.moment
import react.RBuilder
import react.dom.h2
import react.dom.span
import styled.css
import styled.styledDiv

fun RBuilder.multipleLocale() {
    h2 { +"Multiple Locale Support" }
    styledDiv {
        css { +AppStyles.codeBox }
        styledDiv {
            css { +AppStyles.code }
            +"moment().locale()"
            span { +moment().locale() }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('LT')"
            span { +moment().format("LT") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('LTS')"
            span { +moment().format("LTS") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('L') "
            span { +moment().format("L")  }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('l')"
            span { +moment().format("l") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('LL')"
            span { +moment().format("LL") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('ll')"
            span { +moment().format("ll") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('LLL')"
            span { +moment().format("LLL") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('lll')"
            span { +moment().format("lll") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('LLLL')"
            span { +moment().format("LLLL") }
        }
        styledDiv {
            css { +AppStyles.code }
            +"moment().format('llll')"
            span { +moment().format("llll") }
        }
    }
}
