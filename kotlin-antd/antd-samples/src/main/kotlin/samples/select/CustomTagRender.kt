package samples.select

import antd.select.*
import antd.tag.*
import kotlinext.js.*
import react.*
import styled.*

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
