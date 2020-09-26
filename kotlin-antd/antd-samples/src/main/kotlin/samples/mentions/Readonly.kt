package samples.mentions

import antd.mentions.mentions
import antd.mentions.option
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private fun getOptions(): Array<ReactElement> {
    return arrayOf("afc163", "zombiej", "yesmeck").map {
        buildElement {
            option {
                attrs {
                    key = it
                    value = it
                }
                +it
            }
        }
    }.toTypedArray()
}

fun RBuilder.readonly() {
    styledDiv {
        css { MentionsStyles.readonly }
        div {
            div {
                attrs.jsStyle = js { marginBottom = 10 }
                mentions {
                    attrs {
                        style = js { width = "100%" }
                        placeholder = "this is disabled Mentions"
                        disabled = true
                    }
                    childList.add(getOptions())
                }
            }
            mentions {
                attrs {
                    style = js { width = "100%" }
                    placeholder = "this is readOnly Mentions"
                    readOnly = true
                }
                childList.add(getOptions())
            }
        }
    }
}
