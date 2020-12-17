package samples.anchor

import antd.anchor.*
import react.*
import styled.*

private val handleChange = { link: String ->
    console.log("Anchor:OnChange", link)
}

fun RBuilder.onChange() {
    styledDiv {
        css { +AnchorStyles.onChange }
        anchor {
            attrs {
                affix = false
                onChange = handleChange
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
