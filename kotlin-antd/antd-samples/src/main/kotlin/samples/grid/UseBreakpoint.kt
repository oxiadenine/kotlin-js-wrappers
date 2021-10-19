package samples.grid

import antd.tag.tag
import react.RBuilder
import react.Props
import react.child
import react.fc
import styled.css
import styled.styledDiv

private val useBreakpointDemo = fc<Props> {
    val screens = antd.grid.useBreakpoint()

    +"Current break point: "
    js("Object")
        .entries(screens)
        .unsafeCast<Array<Array<dynamic>>>()
        .map { it[0].unsafeCast<String>() to it[1] }.toMap()
        .filter { screen -> screen.value.unsafeCast<Boolean>() }
        .map { screen ->
            tag {
                attrs {
                    color = "blue"
                    key = screen.key
                }
                +screen.key
            }
        }.toTypedArray()
}

private fun RBuilder.useBreakpointDemo() = child(useBreakpointDemo) {}

fun RBuilder.useBreakpoint() {
    styledDiv {
        css { +GridStyles.useBreakpoint }
        useBreakpointDemo()
    }
}
