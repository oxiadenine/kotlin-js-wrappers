package samples.grid

import antd.grid.col
import antd.grid.row
import antd.slider.SliderMarks
import antd.slider.slider
import kotlinx.css.*
import react.*
import react.dom.div
import react.dom.pre
import styled.css
import styled.styledDiv
import styled.styledSpan

external interface PlaygroundAppState : State {
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

    private val handleGutterChange = fun(value: Number) {
        setState {
            gutterKey = value
        }
    }

    private val handleColCountChange = fun(value: Number) {
        setState {
            colCountKey = value
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
            styledDiv {
                css { marginBottom = 16.px }
                styledSpan {
                    css { marginRight = 6.px }
                    +"Gutter (px): "
                }
                styledDiv {
                    css { width = LinearDimension("50%") }
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
                styledSpan {
                    css { marginRight = 6.px }
                    +"Column Count: "
                }
                styledDiv {
                    css { width = LinearDimension("50%") }
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
