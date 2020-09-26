package samples.cascader

import antd.cascader.*
import kotlinext.js.*
import react.*
import styled.*

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jsObject {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jsObject {
                value = "hangzhou"
                label = "Hangzhou"
                children = arrayOf(
                    jsObject {
                        value = "xihu"
                        label = "West Lake"
                    }
                )
            }
        )
    },
    jsObject {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(
            jsObject {
                value = "nanjing"
                label = "Nanjing"
                children = arrayOf(
                    jsObject {
                        value = "zhonghuamen"
                        label = "Zhong Hua Men"
                    }
                )
            }
        )
    }
)

private fun handleChange(value: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value)
}

fun RBuilder.changeOnSelection() {
    styledDiv {
        css { +CascaderStyles.changeOnSelect }
        cascader {
            attrs {
                options = cascaderOptions
                onChange = ::handleChange
                changeOnSelect = true
            }
        }
    }
}
