package samples.card

import antd.avatar.*
import antd.card.*
import antd.icon.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

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
                        icon {
                            attrs.type = "setting"
                        }
                    },
                    buildElement {
                        icon {
                            attrs.type = "edit"
                        }
                    },
                    buildElement {
                        icon {
                            attrs.type = "ellipsis"
                        }
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
