package samples.tabs

import antd.select.SelectComponent
import antd.select.option
import antd.select.select
import antd.tabs.tabPane
import antd.tabs.tabs
import kotlinext.js.js
import react.*
import react.dom.div
import styled.css
import styled.styledDiv

private val positionList = arrayOf("left", "right", "top", "bottom")

private val list = (0..20).mapIndexed { index, _ -> index }.toTypedArray()

interface NestDemoState : RState {
    var parentPos: String?
    var childPos: String?
    var parenType: String?
    var childType: String?
}

class NestDemo : RComponent<RProps, NestDemoState>() {
    override fun NestDemoState.init() {
        parentPos = undefined
        childPos = undefined
        parenType = undefined
        childType = undefined
    }

    override fun RBuilder.render() {
        div {
            select<String, SelectComponent<String>> {
                attrs {
                    style = js { width = 200 }
                    onChange = { value, _ ->
                        setState {
                            parentPos = value
                        }
                    }
                }
                positionList.map { pos ->
                    option {
                        attrs {
                            key = pos
                            value = pos
                        }
                        +"Parent - $pos"
                    }
                }.toTypedArray()
            }
            select<String, SelectComponent<String>> {
                attrs {
                    style = js { width = 200 }
                    onChange = { value, _ ->
                        setState {
                            childPos = value
                        }
                    }
                }
                positionList.map { pos ->
                    option {
                        attrs {
                            key = pos
                            value = pos
                        }
                        +"Child - $pos"
                    }
                }.toTypedArray()
            }
            select<String, SelectComponent<String>> {
                attrs {
                    style = js { width = 200 }
                    onChange = { value, _ ->
                        setState {
                            parenType = value
                        }
                    }
                }
                option {
                    attrs.value = "line"
                    +"Parent - line"
                }
                option {
                    attrs.value = "card"
                    +"Parent - card"
                }
            }
            select<String, SelectComponent<String>> {
                attrs {
                    style = js { width = 200 }
                    onChange = { value, _ ->
                        setState {
                            childType = value
                        }
                    }
                }
                option {
                    attrs.value = "line"
                    +"Child - line"
                }
                option {
                    attrs.value = "card"
                    +"Child - card"
                }
            }
            tabs {
                attrs {
                    defaultActiveKey = "1"
                    tabPosition = state.parentPos
                    type = state.parenType
                }
                tabPane {
                    attrs {
                        tab = "Tab 1"
                        key = "1"
                    }
                    tabs {
                        attrs {
                            defaultActiveKey = "1"
                            tabPosition = state.childPos
                            type = state.childType
                            style = js { height = 300 }
                        }
                        list.map { i ->
                            tabPane {
                                attrs {
                                    tab = "Tab $i"
                                    key = "$i"
                                }
                                +"TTTT $i"
                            }
                        }.toTypedArray()
                    }
                }
                tabPane {
                    attrs {
                        tab = "Tab 2"
                        key = "2"
                    }
                    +"content of Tab Pane 2"
                }
            }
        }
    }
}

fun RBuilder.nestDemo() = child(NestDemo::class) {}

fun RBuilder.nest() {
    styledDiv {
        css { +TabsStyles.nest }
        nestDemo()
    }
}
