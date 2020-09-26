package samples.grid

import antd.grid.*
import antd.grid.col
import antd.slider.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

interface PlaygroundAppState : RState {
    var gutterKey: Number
    var colCountKey: Number
}

class PlaygroundApp : RComponent<RProps, PlaygroundAppState>() {
    private val gutters: dynamic = object {}
    private val colCounts: dynamic = object {}

    init {
        arrayOf(8, 16, 24, 32, 40, 48).forEachIndexed { index, value ->
            gutters[index] = value
        }

        arrayOf(2, 3, 4, 6, 8, 12).forEachIndexed { index, value ->
            colCounts[index] = value
        }
    }

    private val handleGutterChange = fun(value: SliderValue) {
        setState {
            gutterKey = value as Number
        }
    }

    private val handleColCountChange = fun(value: SliderValue) {
        setState {
            colCountKey = value as Number
        }
    }

    override fun PlaygroundAppState.init() {
        gutterKey = 1
        colCountKey = 2
    }

    override fun RBuilder.render() {
        val colCount = colCounts[state.colCountKey.toInt()].unsafeCast<Number>().toInt()
        val cols = mutableListOf<ReactElement>()
        var colCode = ""

        for (i in 1..colCount) {
            val col = buildElement {
                col {
                    attrs {
                        key = i.toString()
                        span = 24 / colCount
                    }
                    div { +"Column" }
                }
            }
            cols.add(col)

            colCode += "  <Col span={${24 / colCount}} />\n"
        }

        div {
            div {
                attrs.jsStyle = js { marginBottom = 16 }
                span {
                    attrs.jsStyle = js { marginRight = 6 }
                    +"Gutter (px): "
                }
                div {
                    attrs.jsStyle = js { width = "50%" }
                    slider {
                        attrs {
                            min = 0
                            max = js("Object").keys(gutters).length.unsafeCast<Number>().toInt() - 1
                            value = state.gutterKey
                            onChange = handleGutterChange
                            marks = gutters.unsafeCast<SliderMarks>()
                            step = null
                        }
                    }
                }
                span {
                    attrs.jsStyle = js { marginRight = 6 }
                    +"Column Count: "
                }
                div {
                    attrs.jsStyle = js { width = "50%" }
                    slider {
                        attrs {
                            min = 0
                            max = js("Object").keys(colCounts).length.unsafeCast<Number>().toInt() - 1
                            value = state.colCountKey
                            onChange = handleColCountChange
                            marks = colCounts.unsafeCast<SliderMarks>()
                            step = null
                        }
                    }
                }
            }
            row {
                attrs.gutter = gutters[state.gutterKey.toInt()].unsafeCast<Any>()
                childList.add(cols.toTypedArray())
            }
            pre {
                row {
                    attrs.gutter = gutters[state.gutterKey.toInt()].unsafeCast<Any>()
                    +"<Row gutter={${gutters[state.gutterKey]}}>\n"
                    +colCode
                    +"</Row>"
                }
            }
        }
    }
}

fun RBuilder.playgroundApp() = child(PlaygroundApp::class) {}

fun RBuilder.playground() {
    styledDiv {
        css { +GridStyles.playground }
        playgroundApp()
    }
}
