package samples.space

import antd.button.button
import antd.icon.uploadOutlined
import antd.popconfirm.popconfirm
import antd.space.space
import antd.upload.UploadComponent
import antd.upload.upload
import react.RBuilder
import styled.css
import styled.styledDiv

private fun RBuilder.spaceDemo() {
    space {
        +"Space"
        button {
            attrs.type = "primary"
            +"Button"
        }
        upload<Any, UploadComponent<Any>> {
            button {
                uploadOutlined {}
                +" Click to Upload"
            }
        }
        popconfirm {
            attrs {
                title = "re you sure delete this task?"
                okText = "Yes"
                cancelText = "No"
            }
            button { +"Confirm" }
        }
    }
}

fun RBuilder.base() {
    styledDiv {
        css { +SpaceStyles.base }
        spaceDemo()
    }
}
