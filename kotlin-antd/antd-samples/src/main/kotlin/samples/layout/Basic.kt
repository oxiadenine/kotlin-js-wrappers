package samples.layout

import antd.layout.layout
import antd.layout.header
import antd.layout.content
import antd.layout.footer
import antd.layout.sider
import kotlinx.html.id
import react.*
import react.dom.*


fun RBuilder.basic() {
    div("layout-container") {
        attrs.id = "layout-basic"
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
