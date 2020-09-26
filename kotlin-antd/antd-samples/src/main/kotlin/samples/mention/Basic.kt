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

private fun handleSelect(suggestion: String, data: Any?) {
    console.log("onSelect", suggestion)
}

fun RBuilder.basic() {
    styledDiv {
        css { +MentionStyles.basic }
        mention {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
                defaultValue = MentionComponent.toContentState("@afc163")
                suggestions = arrayOf("afc163", "benjycui", "yiminghe", "RaoHai", "中文", "にほんご")
                onSelect = ::handleSelect
            }
        }
    }
}
