package samples.anchor

import antd.anchor.*
import kotlinx.browser.*
import react.*
import styled.*

private val anchorExample = functionalComponent<RProps> {
    val (targetOffset, setTargetOffset) = useState<Number?>(null)

    useEffect(emptyList()) {
        setTargetOffset(window.innerHeight / 2)
    }

    anchor {
        attrs.targetOffset = targetOffset
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

fun RBuilder.anchorExample() = child(anchorExample)

fun RBuilder.targetOffset() {
    styledDiv {
        css { +AnchorStyles.targetOffset }
        anchorExample()
    }
}
