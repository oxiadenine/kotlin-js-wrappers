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
                    },
                    jsObject {
                        value = "xiasha"
                        label = "Xia Sha"
                        disabled = true
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
    console.log(value, selectedOptions)
}

private fun searchFilter(inputValue: String, path: Array<CascaderOptionType>, names: FilledFieldNamesType): Boolean {
    return path.any { option ->
        option.label!!.unsafeCast<String>().toLowerCase().contains(inputValue.toLowerCase())
    }
}

fun RBuilder.search() {
    styledDiv {
        css { +CascaderStyles.search }
        cascader {
            attrs {
                options = cascaderOptions
                onChange = ::handleChange
                placeholder = "Please select"
                showSearch = jsObject<ShowSearchType> {
                    filter = ::searchFilter
                }
            }
        }
    }
}
