package samples.grid

import antd.grid.row
import antd.grid.col
import kotlinx.html.id
import react.*
import react.dom.*

interface DemoBoxProps : RProps {
    var value: Number
}

class DemoBoxComponent : RComponent<DemoBoxProps, RState>() {
    override fun RBuilder.render() {
        p("height-${props.value}") {
            childList.add(props.children)
        }
    }
}

fun RBuilder.demoBox(handler: RHandler<DemoBoxProps>) = child(DemoBoxComponent::class, handler)

fun RBuilder.flexAlign() {
    div("grid-container") {
        attrs.id = "grid-flex-align"
        div {
            p { +"Align Top" }
            row {
                attrs {
                    type = "flex"
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
                    type = "flex"
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
                    type = "flex"
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
