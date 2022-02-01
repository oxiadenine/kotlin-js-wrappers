package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import kotlinext.js.jso
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.buildElement
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

private val handleDisplayRender = { label: Array<String>, _: Array<CascaderOptionType>? ->
    buildElement { +label[label.size - 1] }.unsafeCast<ReactElement>()
}

fun RBuilder.hover() {
    styledDiv {
        css { +CascaderStyles.hover }
        cascader {
            attrs {
                options = cascaderOptions
                expandTrigger = "hover"
                displayRender = handleDisplayRender
                onChange = handleChange
            }
        }
    }
}
