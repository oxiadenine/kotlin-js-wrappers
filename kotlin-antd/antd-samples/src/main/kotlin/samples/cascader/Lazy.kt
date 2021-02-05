package samples.cascader

import antd.cascader.*
import kotlinext.js.*
import kotlinx.browser.*
import react.*
import styled.*

private val cascaderOptions = arrayOf<CascaderOptionType>(
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
    var options: Array<CascaderOptionType>
}

class LazyOptions : RComponent<RProps, LazyOptionsState>() {
    private val handleChange = fun(value: CascaderValueType, selectedOptions: Array<CascaderOptionType>?) {
        console.log(value, selectedOptions!!)
    }

    private val handleLoadData = fun(selectedOptions: Array<CascaderOptionType>?) {
        val targetOption = selectedOptions!![selectedOptions.size - 1].unsafeCast<CascaderOptionType>()
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
