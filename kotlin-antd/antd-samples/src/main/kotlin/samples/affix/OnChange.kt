package samples.affix

import antd.affix.*
import antd.button.*
import react.*
import styled.*

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
