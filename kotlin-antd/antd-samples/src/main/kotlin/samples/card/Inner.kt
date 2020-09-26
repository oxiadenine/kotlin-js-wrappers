package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.inner() {
    styledDiv {
        css { +CardStyles.inner }
        card {
            attrs.title = "Card title"
            p {
                attrs.jsStyle = js {
                    fontSize = 14
                    color = "rgba(0, 0, 0, 0.85)"
                    marginButton = 16
                    fontWeight = 500
                }
                +"Group title"
            }
            card {
                attrs {
                    type = "inner"
                    title = "Inner Card title"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                }
                +"Inner Card content"
            }
            card {
                attrs {
                    style = js { marginTop = 16 }
                    type = "inner"
                    title = "Inner Card title"
                    extra = buildElement {
                        a {
                            attrs.href = "#"
                            +"More"
                        }
                    }
                }
                +"Inner Card content"
            }
        }
    }
}
