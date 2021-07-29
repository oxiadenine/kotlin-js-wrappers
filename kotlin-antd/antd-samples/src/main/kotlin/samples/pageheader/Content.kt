package samples.pageheader

import antd.breadcrumb.Route
import antd.pageheader.pageHeader
import antd.typography.typographyParagraph
import kotlinext.js.jsObject
import kotlinx.html.classes
import react.RBuilder
import react.buildElement
import react.dom.*
import styled.css
import styled.styledDiv

private val breadcrumbRoutes = arrayOf<Route>(
    jsObject {
        path = "index"
        breadcrumbName = "First-level Menu"
    },
    jsObject {
        path = "first"
        breadcrumbName = "Second-level Menu"
    },
    jsObject {
        path = "second"
        breadcrumbName = "Third-level Menu"
    }
)

private val content = buildElement {
    div {
        attrs.classes = setOf("content")
        typographyParagraph {
            +"""
                Ant Design interprets the color system into two levels: a system-level color system and a
                product-level color system.
            """.trimIndent()
        }
        typographyParagraph {
            +"""
                Ant Design&#x27;s design team preferred to design with the HSB color model, which makes it
                easier for designers to have a clear psychological expectation of color when adjusting colors,
                as well as facilitate communication in teams.
            """.trimIndent()
        }
        p {
            attrs.classes = setOf("contentLink")
            a {
                img {
                    attrs {
                        src = "https://gw.alipayobjects.com/zos/rmsportal/MjEImQtenlyueSmVEfUD.svg"
                        alt = "start"
                    }
                }
                +"Quick Start"
            }
            a {
                img {
                    attrs {
                        src = "https://gw.alipayobjects.com/zos/rmsportal/NbuDUAuBlIApFuDvWiND.svg"
                        alt = "info"
                    }
                }
                +"Product Info"
            }
            a {
                img {
                    attrs {
                        src = "https://gw.alipayobjects.com/zos/rmsportal/ohOEPSYdDTNnyMbGuyLb.svg"
                        alt = "doc"
                    }
                }
                +"Product Doc"
            }
        }
    }
}

private val extraContent = buildElement {
    img {
        attrs {
            src = "https://gw.alipayobjects.com/mdn/mpaas_user/afts/img/A*KsfVQbuLRlYAAAAAAAAAAABjAQAAAQ/original"
            alt = "content"
        }
    }
}

fun RBuilder.content() {
    styledDiv {
        css { +PageHeaderStyles.content }
        pageHeader {
            attrs {
                title = "Title"
                breadcrumb = jsObject { routes = breadcrumbRoutes }
            }
            div {
                attrs.classes = setOf("wrap")
                div {
                    attrs.classes = setOf("content")
                    childList.add(content.unsafeCast<Any>())
                }
                div {
                    attrs.classes = setOf("extraContent")
                    childList.add(extraContent.unsafeCast<Any>())
                }
            }
        }
    }
}
