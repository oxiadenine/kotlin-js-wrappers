package samples.mention

import antd.mention.*
import kotlinext.js.*
import react.*
import styled.*

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject { }))
}

private fun handleSelect(suggestion: String, data: Any?) {
    console.log("onSelect", suggestion)
}

fun RBuilder.placemenet() {
    styledDiv {
        css { +MentionStyles.placement }
        mention {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
                suggestions = arrayOf("afc163", "benjycui", "yiminghe", "RaoHai", "中文", "にほんご")
                onSelect = ::handleSelect
                placement = "top"
            }
        }
    }
}
