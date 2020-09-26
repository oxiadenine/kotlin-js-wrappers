package samples.mention

import antd.mention.MentionComponent
import antd.mention.mention
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject {  }))
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
