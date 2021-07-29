package samples.select

import antd.select.CustomTagProps
import antd.select.OptionData
import antd.select.SelectComponent
import antd.select.select
import antd.tag.tag
import kotlinext.js.js
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import styled.css
import styled.styledDiv

private val selectOptions = arrayOf<OptionData>(
    jsObject { value = "gold" },
    jsObject { value = "lime" },
    jsObject { value = "green" },
    jsObject { value = "cyan" }
)

private fun tagRender(props: CustomTagProps) = buildElement {
    tag {
        attrs {
            color = props.value as String
            closable = props.closable
            onClose = props.onClose
            style = js { marginRight = 3 }
        }
        +props.label.unsafeCast<String>()
    }
}

fun RBuilder.customTagRender() {
    styledDiv {
        css { +SelectStyles.customTagRender }
        select<Array<String>, SelectComponent<Array<String>>> {
            attrs {
                mode = "multiple"
                showArrow = true
                tagRender = ::tagRender
                defaultValue = arrayOf("gold", "cyan")
                style = js { width = "100%" }
                options = selectOptions
            }
        }
    }
}
