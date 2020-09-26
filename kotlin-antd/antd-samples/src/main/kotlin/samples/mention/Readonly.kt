package samples.mention

import antd.mention.MentionComponent
import antd.mention.mention
import kotlinext.js.js
import kotlinext.js.jsObject
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private fun handleChange(contentState: Any) {
    console.log(MentionComponent.toString(contentState, jsObject {  }))
}

private val users = arrayOf("afc163", "benjycui", "yiminghe", "jljsj33", "dqaria", "RaoHai")

fun RBuilder.readonlyApp() {
    div {
        div {
            attrs.jsStyle = js { marginBottom = 10 }
            mention {
                attrs {
                    style = js { width = "100%" }
                    onChange = ::handleChange
                    placeholder = "this is disabled Mention"
                    suggestions = users.unsafeCast<Array<Any>>()
                    disabled = true
                }
            }
        }
        mention {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
                placeholder = "this is readOnly Mention"
                suggestions = users.unsafeCast<Array<Any>>()
                readOnly = true
            }
        }
    }
}

fun RBuilder.readonly() {
    styledDiv {
        css { +MentionStyles.readonly }
        readonlyApp()
    }
}
