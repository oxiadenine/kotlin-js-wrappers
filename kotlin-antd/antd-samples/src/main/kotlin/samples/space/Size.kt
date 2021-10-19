package samples.space

import antd.button.button
import antd.radio.radio
import antd.radio.radioGroup
import antd.space.space
import react.*
import react.dom.br
import styled.css
import styled.styledDiv

private val spaceSize = fc<Props> {
    val (size, setSize) = useState("small")

    radioGroup {
        attrs {
            value = size
            onChange = { e ->
                setSize(e.target.value as String)
            }
        }
        radio {
            attrs.value = "small"
            +"Small"
        }
        radio {
            attrs.value = "middle"
            +"Middle"
        }
        radio {
            attrs.value = "large"
            +"large"
        }
    }
    br {}
    br {}
    space {
        attrs.size = size
        button {
            attrs.type = "primary"
            +"Primary"
        }
        button { +"Default" }
        button {
            attrs.type = "dashed"
            +"Dashed"
        }
        button {
            attrs.type = "link"
            +"Link"
        }
    }
}

private fun RBuilder.spaceSize() = child(spaceSize)

fun RBuilder.size() {
    styledDiv {
        css { +SpaceStyles.size }
        spaceSize()
    }
}
