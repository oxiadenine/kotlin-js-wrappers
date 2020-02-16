package samples.anchor

import antd.anchor.anchor
import antd.anchor.anchorLink
import kotlinx.html.id
import react.*
import react.dom.*

fun RBuilder.static() {
    div("anchor-container") {
        attrs.id = "anchor-static"
        anchor {
            attrs.affix = false
            anchorLink {
                attrs {
                    href = "#anchor-basic"
                    title = "Basic demo"
                }
            }
            anchorLink {
                attrs {
                    href = "#anchor-static"
                    title = "Static demo"
                }
            }
            anchorLink {
                attrs {
                    href = "#API"
                    title = "API"
                }
                anchorLink {
                    attrs {
                        href = "#Anchor-Props"
                        title = "Anchor Props"
                    }
                }
                anchorLink {
                    attrs {
                        href = "#Link-Props"
                        title = "Link Props"
                    }
                }
            }
        }
    }
}
