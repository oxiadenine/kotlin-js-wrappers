package samples.anchor

import antd.MouseEvent
import antd.anchor.AnchorLink
import antd.anchor.anchor
import antd.anchor.anchorLink
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import react.*
import react.dom.*

private val handleClick = fun (e: MouseEvent<HTMLElement>, link: AnchorLink) {
    e.preventDefault()

    console.log(link)
}

fun RBuilder.onClick() {
    div("anchor-container") {
        attrs.id = "anchor-on-click"
        anchor {
            attrs {
                affix = false
                onClick = handleClick
            }
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
