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

private fun handleDisplayRender(label: Array<String>, selectedOptions: Array<CascaderOptionType>?): ReactElement {
    return buildElements { +label[label.size - 1] }.unsafeCast<ReactElement>()
}

fun RBuilder.hover() {
    styledDiv {
        css { +CascaderStyles.hover }
        cascader {
            attrs {
                options = cascaderOptions
                expandTrigger = "hover"
                displayRender = ::handleDisplayRender
                onChange = ::handleChange
            }
        }
    }
}
