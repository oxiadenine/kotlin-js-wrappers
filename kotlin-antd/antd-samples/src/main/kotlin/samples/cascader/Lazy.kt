package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import kotlinext.js.jsObject
import react.*
import kotlinx.browser.window
import styled.css
import styled.styledDiv

interface LazyCascaderOptionType : CascaderOptionType {
    var isLeaf: Boolean?
    var loading: Boolean?
}

private val cascaderOptions = arrayOf<LazyCascaderOptionType>(
        jsObject {
            value = "zhejiang"
            label = "Zhejiang"
            isLeaf = false
        },
        jsObject {
            value = "jiangsu"
            label = "Jiangsu"
            isLeaf = false
        }
)

interface LazyOptionsState : RState {
    var options: Array<LazyCascaderOptionType>
}

class LazyOptions : RComponent<RProps, LazyOptionsState>() {
    private val handleChange = fun (value: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
        console.log(value, selectedOptions!!)
    }

    private val handleLoadData = fun (selectedOptions: Array<CascaderOptionType>?) {
        val targetOption = selectedOptions!![selectedOptions.size - 1].unsafeCast<LazyCascaderOptionType>()
        targetOption.loading = true

        // load options lazily
        window.setTimeout({
            targetOption.loading = false
            targetOption.children = arrayOf(
                    jsObject {
                        label = buildElement { +"${targetOption.label} Dynamic 1" }
                        value = "dynamic1"
                    },
                    jsObject {
                        label = buildElement { +"${targetOption.label} Dynamic 2" }
                        value = "dynamic2"
                    }
            )

            setState {
                options = state.options.copyOf()
            }
        }, 100)
    }

    override fun LazyOptionsState.init() {
        options = cascaderOptions
    }

    override fun RBuilder.render() {
        cascader {
            attrs {
                options = state.options.unsafeCast<Array<CascaderOptionType>>()
                loadData = handleLoadData
                onChange = handleChange
                changeOnSelect = true
            }
        }
    }
}

fun RBuilder.lazyOptions() = child(LazyOptions::class) {}

fun RBuilder.lazy() {
    styledDiv {
        css { +CascaderStyles.lazy }
        lazyOptions()
    }
}
