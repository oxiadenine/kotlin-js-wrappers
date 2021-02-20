package samples.space

import antd.button.button
import antd.slider.slider
import antd.space.space
import react.RBuilder
import react.RProps
import react.child
import react.dom.br
import react.functionalComponent
import react.useState
import styled.css
import styled.styledDiv

private val spaceCustomizeSize = functionalComponent<RProps> {
    val (size, setSize) = useState(8 as Number)

    slider {
        attrs {
            value = size
            onChange = { value: Number ->
                setSize(value)
            }
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

private fun RBuilder.spaceCustomizeSize() = child(spaceCustomizeSize)

fun RBuilder.customize() {
    styledDiv {
        css { +SpaceStyles.customize }
        spaceCustomizeSize()
    }
}
