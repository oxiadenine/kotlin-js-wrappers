package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import antd.icon.smileOutlined
import kotlinext.js.js
import kotlinext.js.jso
import react.RBuilder
import react.buildElement
import react.dom.div
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

private val handleChange = { value: CascaderValueType, _: Array<CascaderOptionType>? ->
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
                    onChange = handleChange
                    placeholder = "Please select"
                }
            }
            cascader {
                attrs {
                    suffixIcon = "ab"
                    style = js { marginTop = "1rem" }
                    options = cascaderOptions
                    onChange = handleChange
                    placeholder = "Please select"
                }
            }
        }
    }
}
