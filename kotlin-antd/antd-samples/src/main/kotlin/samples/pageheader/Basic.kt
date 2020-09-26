package samples.pageheader

import antd.pageheader.*
import react.*
import styled.*

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
