package samples.descriptions

import antd.ScreenSizeMap
import antd.descriptions.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.responsiveDemo() {
    descriptions {
        attrs {
            title = "Responsive Descriptions"
            column = jsObject<ScreenSizeMap> {
                xxl = 4
                xl = 2
                lg = 3
                md = 3
                sm = 2
                xs = 1
            }
        }
        descriptionsItem {
            attrs.label = "Product"
            +"Cloud Database"
        }
        descriptionsItem {
            attrs.label = "Billing"
            +"Prepaid"
        }
        descriptionsItem {
            attrs.label = "Time"
            +"18:00:00"
        }
        descriptionsItem {
            attrs.label = "Amount"
            +"\$80.00"
        }
        descriptionsItem {
            attrs.label = "Discount"
            +"$20.00"
        }
        descriptionsItem {
            attrs.label = "Official"
            +"\$60.00"
        }
        descriptionsItem {
            attrs.label = "Config Info"
            +"Data disk type: MongoDB"
            br {}
            +"Database version: 3.4"
            br {}
            +"Package: dds.mongo.mid"
            br {}
            +"Storage space: 10 GB"
            br {}
            +"Replication_factor:3"
            br {}
            +"Region: East China 1"
            br {}
        }
    }
}

fun RBuilder.responsive() {
    styledDiv {
        css { +DescriptionsStyles.responsive }
        responsiveDemo()
    }
}
