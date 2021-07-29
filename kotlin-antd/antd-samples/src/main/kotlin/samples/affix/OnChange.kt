package samples.affix

import antd.affix.affix
import antd.button.button
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.onChange() {
    styledDiv {
        css { +AffixStyles.onChange }
        affix {
            attrs {
                offsetTop = 120
                onChange = { affixed -> console.log(affixed) }
            }
            button { +"120px to affix top" }
        }
    }
}
