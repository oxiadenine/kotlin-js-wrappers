package samples.card

import antd.avatar.avatar
import antd.card.card
import antd.card.cardMeta
import antd.icon.icon
import kotlinext.js.js
import kotlinx.html.id
import react.RBuilder
import react.buildElement
import react.dom.div
import react.dom.img

fun RBuilder.meta() {
    div("card-container") {
        attrs.id = "card-meta"
        card {
            attrs {
                style = js { width = 300 }
                cover = buildElement {
                    img {
                        attrs {
                            alt = "example"
                            src = "https://gw.alipayobjects.com/zos/rmsportal/JiqGstEfoWAOHiTxclqi.png"
                        }
                    }
                }
                actions = arrayOf(
                        buildElement {
                            icon {
                                attrs.type = "setting"
                            }
                        }!!,
                        buildElement {
                            icon {
                                attrs.type = "edit"
                            }
                        }!!,
                        buildElement {
                            icon {
                                attrs.type = "ellipsis"
                            }
                        }!!
                )
            }
            cardMeta {
                attrs {
                    avatar = buildElement {
                        avatar {
                            attrs.src = "https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png"
                        }
                    }
                    title = "Card title"
                    description = "This is the description"
                }
            }
        }
    }
}
