package samples.tag

import antd.MouseEvent
import antd.tag.*
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*
import styled.*

private fun log(e: MouseEvent<HTMLElement>) {
    console.log(e)
}

private fun preventDefault(e: MouseEvent<HTMLElement>) {
    e.preventDefault()

    console.log("Clicked! But prevent default.")
}

fun RBuilder.basic() {
    styledDiv {
        css { +TagStyles.basic }
        div {
            tag { +"Tag 1" }
            tag {
                a {
                    attrs.href = "https://github.com/ant-design/ant-design/issues/1862"
                    +"Link"
                }
            }
            tag {
                attrs {
                    closable = true
                    onClose = ::log
                }
                +"Tag 2"
            }
            tag {
                attrs {
                    closable = true
                    onClose = ::preventDefault
                }
                +"Prevent default"
            }
        }
    }
}
