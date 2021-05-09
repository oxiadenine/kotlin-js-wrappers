package samples.mentions

import antd.mentions.*
import antd.mentions.option
import kotlinext.js.*
import kotlinx.css.marginBottom
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

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
            styledDiv {
                css { marginBottom = 10.px }
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
