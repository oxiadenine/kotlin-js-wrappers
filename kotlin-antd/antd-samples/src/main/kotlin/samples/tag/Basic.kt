package samples.tag

import antd.tag.tag
import kotlinx.html.id
import org.w3c.dom.events.Event
import react.RBuilder
import react.dom.a
import react.dom.div

private fun log(e: Event) {
    console.log(e)
}

private fun preventDefault(e: Event) {
    e.preventDefault()

    console.log("Clicked! But prevent default.")
}

fun RBuilder.basic() {
    div("tag-container") {
        attrs.id = "tag-basic"
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
