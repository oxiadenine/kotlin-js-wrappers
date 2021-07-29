package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

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

private val handleChange = { value: CascaderValueType, _: Array<CascaderOptionType>? ->
    console.log(value)
}

fun RBuilder.defaultValue() {
    styledDiv {
        css { +CascaderStyles.defaultValue }
        cascader {
            attrs {
                defaultValue = arrayOf("zhejiang", "hangzhou", "xihu")
                options = cascaderOptions
                onChange = handleChange
            }
        }
    }
}
