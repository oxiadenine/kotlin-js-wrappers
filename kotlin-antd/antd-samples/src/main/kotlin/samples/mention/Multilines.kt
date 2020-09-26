package samples.mention

import antd.mention.*
import kotlinext.js.*
import react.*
import styled.*

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject { }))
}

fun RBuilder.multilines() {
    styledDiv {
        css { +MentionStyles.multilines }
        mention {
            attrs {
                style = js {
                    width = "100%"
                    height = 100
                }
                onChange = ::handleChange
                suggestions = arrayOf("afc163", "benjycui", "yiminghe", "jljsj33", "dqaria", "RaoHai")
                multiLines = true
            }
        }
    }
}
