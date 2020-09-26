package samples.card

import antd.card.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.flexibleContent() {
    styledDiv {
        css { +CardStyles.flexibleContent }
        card {
            attrs {
                hoverable = true
                style = js { width = 240 }
                cover = buildElement {
                    img {
                        attrs {
                            alt = "example"
                            src = "https://os.alipayobjects.com/rmsportal/QBnOOoLaAfKPirc.png"
                        }
                    }
                }
            }
            cardMeta {
                attrs {
                    title = "Europe Street beat"
                    description = "www.instagram.com"
                }
            }
        }
    }
}
