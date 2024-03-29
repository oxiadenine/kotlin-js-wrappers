package samples.affix

import antd.affix.affix
import antd.button.button
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface BasicDemoState : State {
    var top: Number
    var bottom: Number
}

class BasicDemo : RComponent<Props, BasicDemoState>() {
    override fun BasicDemoState.init() {
        top = 10
        bottom = 10
    }

    override fun RBuilder.render() {
        div {
            affix {
                attrs.offsetTop = state.top
                button {
                    attrs {
                        type = "primary"
                        onClick = {
                            setState {
                                top = state.top.toInt() + 10
                            }
                        }
                    }
                    +"Affix top"
                }
            }
            br {}
            affix {
                attrs.offsetBottom = state.bottom
                button {
                    attrs {
                        type = "primary"
                        onClick = {
                            setState {
                                bottom = state.bottom.toInt() + 10
                            }
                        }
                    }
                    +"Affix bottom"
                }
            }
        }
    }
}

fun RBuilder.basicDemo() = child(BasicDemo::class) {}

fun RBuilder.basic() {
    styledDiv {
        css { +AffixStyles.basic }
        basicDemo()
    }
}
