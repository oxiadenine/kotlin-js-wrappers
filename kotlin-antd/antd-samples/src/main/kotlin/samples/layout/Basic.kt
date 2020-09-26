package samples.layout

import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.footer
import antd.layout.sider
import react.*
import react.dom.*
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
