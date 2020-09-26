package samples.anchor

import antd.*
import antd.anchor.*
import org.w3c.dom.*
import react.*
import styled.*

private val handleClick = fun(e: MouseEvent<HTMLElement>, link: AnchorLink) {
    e.preventDefault()

    console.log(link)
}

fun RBuilder.onClick() {
    styledDiv {
        css { +AnchorStyles.onClick }
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
