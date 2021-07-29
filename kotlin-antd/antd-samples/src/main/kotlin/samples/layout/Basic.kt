package samples.layout

import antd.layout.*
import react.RBuilder
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +LayoutStyles.basic }
        div {
            layout {
                header { +"Header" }
                content { +"Content" }
                footer { +"Footer" }
            }
            layout {
                header { +"Header" }
                layout {
                    sider { +"Sider" }
                    content { +"Content" }
                }
                footer { +"Footer" }
            }
            layout {
                header { +"Header" }
                layout {
                    content { +"Content" }
                    sider { +"Sider" }
                }
                footer { +"Footer" }
            }
            layout {
                sider { +"Sider" }
                layout {
                    header { +"Header" }
                    content { +"Content" }
                    footer { +"Footer" }
                }
            }
        }
    }
}
