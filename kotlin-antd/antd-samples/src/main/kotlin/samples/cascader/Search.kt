package samples.cascader

import antd.cascader.*
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jso {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jso {
                value = "hangzhou"
                label = "Hangzhou"
                children = arrayOf(
                    jso {
                        value = "xihu"
                        label = "West Lake"
                    },
                    jso {
                        value = "xiasha"
                        label = "Xia Sha"
                        disabled = true
                    }
                )
            }
        )
    },
    jso {
        value = "jiangsu"
        label = "Jiangsu"
        children = arrayOf(
            jso {
                value = "nanjing"
                label = "Nanjing"
                children = arrayOf(
                    jso {
                        value = "zhonghuamen"
                        label = "Zhong Hua Men"
                    }
                )
            }
        )
    }
)

private fun handleChange(value: CascaderValueType, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value, selectedOptions)
}

private val searchFilter = { inputValue: String, path: Array<CascaderOptionType>, _: FilledFieldNamesType ->
    path.any { option ->
        option.label!!.unsafeCast<String>().lowercase().contains(inputValue.lowercase())
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
                showSearch = jso<ShowSearchType> {
                    filter = searchFilter
                }
            }
        }
    }
}
