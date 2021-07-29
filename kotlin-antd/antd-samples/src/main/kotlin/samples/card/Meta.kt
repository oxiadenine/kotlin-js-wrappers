package samples.card

import antd.avatar.avatar
import antd.card.card
import antd.card.cardMeta
import antd.icon.editOutlined
import antd.icon.ellipsisOutlined
import antd.icon.settingOutlined
import kotlinext.js.js
import react.RBuilder
import react.buildElement
import react.dom.attrs
import react.dom.img
import styled.css
import styled.styledDiv

fun RBuilder.meta() {
    styledDiv {
        css { +CardStyles.meta }
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
                        settingOutlined {}
                    },
                    buildElement {
                        editOutlined {}
                    },
                    buildElement {
                        ellipsisOutlined {}
                    }
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
