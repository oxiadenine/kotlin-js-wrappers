package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
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

fun RBuilder.changeOnSelection() {
    styledDiv {
        css { +CascaderStyles.changeOnSelect }
        cascader {
            attrs {
                options = cascaderOptions
                onChange = handleChange
                changeOnSelect = true
            }
        }
    }
}
