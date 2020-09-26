package samples.descriptions

import antd.descriptions.descriptions
import antd.descriptions.descriptionsItem
import react.RBuilder
import styled.css
import styled.styledDiv

fun RBuilder.vertical() {
    styledDiv {
        css { +DescriptionsStyles.vertical }
        descriptions {
            attrs {
                title = "User Info"
                layout = "vertical"
            }
            descriptionsItem {
                attrs.label = "UserName"
                +"Zhou Maomao"
            }
            descriptionsItem {
                attrs.label = "Telephone"
                +"1810000000"
            }
            descriptionsItem {
                attrs.label = "Live"
                +"Hangzhou, Zhejiang"
            }
            descriptionsItem {
                attrs.label = "Remark"
                +"empty"
            }
            descriptionsItem {
                attrs.label = "Address"
                +"No. 18, Wantang Road, Xihu District, Hangzhou, Zhejiang, China"
            }
        }
    }
}
