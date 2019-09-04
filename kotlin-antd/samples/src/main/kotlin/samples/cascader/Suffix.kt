package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import antd.icon.icon
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.id
import react.*
import react.dom.*

private val cascaderOptions= arrayOf<CascaderOptionType>(
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

fun RBuilder.suffix() {
    div("cascader-container") {
        attrs.id = "cascader-suffix"
        div {
            cascader {
                attrs {
                    suffixIcon = buildElement {
                        icon {
                            attrs.type = "smile"
                        }
                    }
                    options = cascaderOptions
                    onChange = ::handleChange
                    placeholder = "Please select"
                }
            }
            cascader {
                attrs {
                    suffixIcon = "ab"
                    style = js { marginTop ="1rem" }
                    options = cascaderOptions
                    onChange = ::handleChange
                    placeholder = "Please select"
                }
            }
        }
    }
}
