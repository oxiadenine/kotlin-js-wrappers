package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import kotlinext.js.jsObject
import react.*
import styled.css
import styled.styledDiv

interface FieldNamesCascaderOptionType : CascaderOptionType {
    var code: String?
    var name: Any?
    var items: Array<FieldNamesCascaderOptionType>?
}

private val cascaderOptions = arrayOf<FieldNamesCascaderOptionType>(
        jsObject {
            code = "zhejiang"
            name = "Zhejiang"
            items = arrayOf(
                    jsObject {
                        code = "hangzhou"
                        name = "Hangzhou"
                        items = arrayOf(
                                jsObject {
                                    code = "xihu"
                                    name = "West Lake"
                                }
                        )
                    }
            )
        },
        jsObject {
            code = "jiangsu"
            name = "Jiangsu"
            items = arrayOf(
                    jsObject {
                        code = "nanjing"
                        name = "Nanjing"
                        items = arrayOf(
                                jsObject {
                                    code = "zhonghuamen"
                                    name = "Zhong Hua Men"
                                }
                        )
                    }
            )
        }
)

private fun handleChange(value: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value)
}

fun RBuilder.fieldNames() {
    styledDiv {
        css { +CascaderStyles.fieldNames }
        cascader {
            attrs {
                fieldNames = jsObject {
                    value = "code"
                    label = "name"
                    children = "items"
                }
                options = cascaderOptions.unsafeCast<Array<CascaderOptionType>>()
                onChange = ::handleChange
                placeholder = "Please select"
            }
        }
    }
}
