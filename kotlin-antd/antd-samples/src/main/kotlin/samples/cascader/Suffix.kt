package samples.cascader

import antd.cascader.*
import antd.icon.*
import kotlinext.js.*
import react.*
import react.dom.*
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

fun RBuilder.suffix() {
    styledDiv {
        css { +CascaderStyles.suffix }
        div {
            cascader {
                attrs {
                    suffixIcon = buildElement {
                        smileOutlined {}
                    }
                    options = cascaderOptions
                    onChange = ::handleChange
                    placeholder = "Please select"
                }
            }
            cascader {
                attrs {
                    suffixIcon = "ab"
                    style = js { marginTop = "1rem" }
                    options = cascaderOptions
                    onChange = ::handleChange
                    placeholder = "Please select"
                }
            }
        }
    }
}
