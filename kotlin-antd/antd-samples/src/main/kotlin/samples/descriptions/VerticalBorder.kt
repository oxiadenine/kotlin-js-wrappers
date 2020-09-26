package samples.descriptions

import antd.badge.*
import antd.descriptions.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.verticalBorder() {
    styledDiv {
        css { +DescriptionsStyles.verticalBorder }
        descriptions {
            attrs {
                title = "User Info"
                layout = "vertical"
                bordered = true
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
                attrs.label = "Automatic Renewal"
                +"YES"
            }
            descriptionsItem {
                attrs.label = "Order time"
                +"2018-04-24 18:00:00"
            }
            descriptionsItem {
                attrs {
                    label = "Usage Time"
                    span = 3
                }
                +"2019-04-24 18:00:00"
            }
            descriptionsItem {
                attrs {
                    label = "Status"
                    span = 3
                }
                badge {
                    attrs {
                        status = "processing"
                        text = "Running"
                    }
                }
            }
            descriptionsItem {
                attrs.label = "Negotiated Amount"
                +"\$80.00"
            }
            descriptionsItem {
                attrs.label = "Discount"
                +"\$20.00"
            }
            descriptionsItem {
                attrs.label = "Official Receipts"
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
}
