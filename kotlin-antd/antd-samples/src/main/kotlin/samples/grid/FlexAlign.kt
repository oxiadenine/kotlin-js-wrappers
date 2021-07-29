package samples.grid

import antd.grid.col
import antd.grid.row
import kotlinx.html.classes
import react.*
import react.dom.div
import react.dom.p
import styled.css
import styled.styledDiv

external interface DemoBoxProps : RProps {
    var value: Number
}

class DemoBoxComponent : RComponent<DemoBoxProps, State>() {
    override fun RBuilder.render() {
        p {
            attrs.classes = setOf("height-${props.value}")
            childList.add(props.children)
        }
    }
}

fun RBuilder.demoBox(handler: RHandler<DemoBoxProps>) = child(DemoBoxComponent::class, handler)

fun RBuilder.flexAlign() {
    styledDiv {
        css { +GridStyles.flexAlign }
        div {
            p { +"Align Top" }
            row {
                attrs {
                    justify = "center"
                    align = "top"
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 100
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 50
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 120
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 80
                        +"col-4"
                    }
                }
            }
            p { +"Align Center" }
            row {
                attrs {
                    justify = "space-around"
                    align = "middle"
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 100
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 50
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 120
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 80
                        +"col-4"
                    }
                }
            }
            p { +"Align Bottom" }
            row {
                attrs {
                    justify = "space-between"
                    align = "bottom"
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 100
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 50
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 120
                        +"col-4"
                    }
                }
                col {
                    attrs.span = 4
                    demoBox {
                        attrs.value = 80
                        +"col-4"
                    }
                }
            }
        }
    }
}
