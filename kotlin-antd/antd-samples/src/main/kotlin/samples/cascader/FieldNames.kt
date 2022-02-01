package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.CascaderValueType
import antd.cascader.cascader
import kotlinext.js.jso
import react.RBuilder
import styled.css
import styled.styledDiv

external interface FieldNamesCascaderOptionType : CascaderOptionType {
    var code: String?
    var name: Any?
    var items: Array<FieldNamesCascaderOptionType>?
}

private val cascaderOptions = arrayOf<FieldNamesCascaderOptionType>(
    jso {
        code = "zhejiang"
        name = "Zhejiang"
        items = arrayOf(
            jso {
                code = "hangzhou"
                name = "Hangzhou"
                items = arrayOf(
                    jso {
                        code = "xihu"
                        name = "West Lake"
                    }
                )
            }
        )
    },
    jso {
        code = "jiangsu"
        name = "Jiangsu"
        items = arrayOf(
            jso {
                code = "nanjing"
                name = "Nanjing"
                items = arrayOf(
                    jso {
                        code = "zhonghuamen"
                        name = "Zhong Hua Men"
                    }
                )
            }
        )
    }
)

private val handleChange = { value: CascaderValueType, _: Array<CascaderOptionType>? ->
    console.log(value)
}

fun RBuilder.fieldNames() {
    styledDiv {
        css { +CascaderStyles.fieldNames }
        cascader {
            attrs {
                fieldNames = jso {
                    value = "code"
                    label = "name"
                    children = "items"
                }
                options = cascaderOptions.unsafeCast<Array<CascaderOptionType>>()
                onChange = handleChange
                placeholder = "Please select"
            }
        }
    }
}
