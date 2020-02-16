package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

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
            disabled = true
        }
)

private fun handleChange(value: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value)
}

fun RBuilder.disabledOption() {
    div("cascader-container") {
        attrs.id = "cascader-disabled-option"
        cascader {
            attrs {
                options = cascaderOptions
                onChange = ::handleChange
            }
        }
    }
}
