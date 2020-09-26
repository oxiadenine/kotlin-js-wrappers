package samples.pageheader

import antd.pageheader.pageHeader
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +PageHeaderStyles.basic }
        pageHeader {
            attrs {
                onBack = {}
                title = "Title"
                subTitle = "This is a subtitle"
            }
        }
    }
}
