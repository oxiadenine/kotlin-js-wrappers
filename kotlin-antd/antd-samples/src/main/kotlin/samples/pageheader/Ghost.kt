package samples.pageheader

import antd.button.button
import antd.descriptions.descriptions
import antd.descriptions.descriptionsItem
import antd.pageheader.pageHeader
import kotlinx.browser.window
import react.RBuilder
import react.buildElement
import react.dom.a
import react.dom.div
import styled.css
import styled.styledDiv

fun RBuilder.ghost() {
    styledDiv {
        css { +PageHeaderStyles.ghost }
        div(classes = "site-page-header-ghost-wrapper") {
            pageHeader {
                attrs {
                    ghost = false
                    onBack = { window.history.back() }
                    title = "Title"
                    subTitle = "This is a subtitle"
                    extra = buildElement {
                        button {
                            attrs.key = "3"
                            +"Operation"
                        }
                        button {
                            attrs.key = "2"
                            +"Operation"
                        }
                        button {
                            attrs {
                                key = "1"
                                type = "primary"
                            }
                            +"Primary"
                        }
                    }
                }
                descriptions {
                    attrs {
                        size = "small"
                        column = 3
                    }
                    descriptionsItem {
                        attrs.label = "Created"
                        +"Lili Qu"
                    }
                    descriptionsItem {
                        attrs.label = "Association"
                        a { +"421421" }
                    }
                    descriptionsItem {
                        attrs.label = "Creation Time"
                        +"2017-01-10"
                    }
                    descriptionsItem {
                        attrs.label = "Effective Time"
                        +"2017-10-10"
                    }
                    descriptionsItem {
                        attrs.label = "Remarks"
                        +"Gonghu Road, Xihu District, Hangzhou, Zhejiang, China"
                    }
                }
            }
        }
    }
}
