package samples.mentions

import antd.mentions.OptionProps
import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleChange(value: Any) {
    console.log("Change: ", value)
}

private fun handleSelect(option: OptionProps, prefix: String) {
    console.log("select", option)
}

fun RBuilder.basic() {
    div("mentions-container") {
        attrs.id = "mentions-basic"
        mentions {
            attrs {
                style = js { width = "100%" }
                onChange = ::handleChange
                onSelect = ::handleSelect
            }
            option {
                attrs.value = "afc163"
                +"afc163"
            }
            option {
                attrs.value = "zombieJ"
                +"zombieJ"
            }
            option {
                attrs.value = "yesmeck"
                +"yesmeck"
            }
        }
    }
}
