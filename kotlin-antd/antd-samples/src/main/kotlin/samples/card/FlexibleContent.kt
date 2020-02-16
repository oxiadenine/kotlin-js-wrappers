package samples.card

import antd.card.card
import antd.card.cardMeta
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.img

fun RBuilder.flexibleContent() {
    div("card-container") {
        attrs.id = "card-flexible-content"
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
