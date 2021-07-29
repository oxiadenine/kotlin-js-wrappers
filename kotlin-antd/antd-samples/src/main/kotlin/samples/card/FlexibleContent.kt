package samples.card

import antd.card.card
import antd.card.cardMeta
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.attrs
import react.dom.img
import styled.css
import styled.styledDiv

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
