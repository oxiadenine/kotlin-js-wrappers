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

private fun handleChange(value: CascaderValueType, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value)
}

fun RBuilder.defaultValue() {
    styledDiv {
        css { +CascaderStyles.defaultValue }
        cascader {
            attrs {
                defaultValue = arrayOf("zhejiang", "hangzhou", "xihu")
                options = cascaderOptions
                onChange = ::handleChange
            }
        }
    }
}
