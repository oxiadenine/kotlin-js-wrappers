package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import kotlinext.js.js
import kotlinext.js.jso
import kotlinx.html.js.onClickFunction
import org.w3c.dom.events.Event
import react.RBuilder
import react.ReactElement
import react.buildElement
import react.dom.a
import react.dom.key
import react.dom.span
import styled.css
import styled.styledDiv

external interface CustomRenderCascaderOptionType : CascaderOptionType {
    var code: Number?
}

private val cascaderOptions = arrayOf<CascaderOptionType>(
    jso {
        value = "zhejiang"
        label = "Zhejiang"
        children = arrayOf(
            jso {
                value = "hangzhou"
                label = "Hangzhou"
                children = arrayOf(
                    jso<CustomRenderCascaderOptionType> {
                        value = "xihu"
                        label = "West Lake"
                        code = 752100
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
                    jso<CustomRenderCascaderOptionType> {
                        value = "zhonghuamen"
                        label = "Zhong Hua Men"
                        code = 453400
                    }
                )
            }
        )
    }
)

private fun handleAreaClick(event: Event, label: String, option: CascaderOptionType) {
    event.stopPropagation()

    console.log("clicked", label, option)
}

private val handleDisplayRender = fun(labels: Array<String>, selectedOptions: Array<CascaderOptionType>?): ReactElement {
    return buildElement {
        labels.forEachIndexed { index, label ->
            val option = selectedOptions!![index]

            if (index == labels.size - 1) {
                span {
                    attrs.key = option.value!! as String
                    +"$label ("
                    a {
                        attrs.onClickFunction = { event ->
                            handleAreaClick(event, label, option)
                        }
                        +"${option.unsafeCast<CustomRenderCascaderOptionType>().code}"
                    }
                    +")"
                }
            } else {
                span {
                    attrs.key = option.value!! as String
                    +"$label / "
                }
            }
        }
    }.unsafeCast<ReactElement>()
}

fun RBuilder.customRender() {
    styledDiv {
        css { +CascaderStyles.customRender }
        cascader {
            attrs {
                options = cascaderOptions
                defaultValue = arrayOf("zhejiang", "hangzhou", "xihu")
                displayRender = handleDisplayRender
                style = js { width = "100%" }
            }
        }
    }
}
