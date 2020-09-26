package samples.empty

import antd.cascader.*
import antd.configprovider.*
import antd.divider.*
import antd.icon.*
import antd.list.*
import antd.select.*
import antd.switch.*
import antd.table.*
import antd.transfer.*
import antd.treeselect.*
import kotlinext.js.*
import kotlinx.html.*
import react.*
import react.dom.*
import styled.*

private val customizeRenderEmpty: RenderEmptyHandler = {
    buildElement {
        div {
            attrs.jsStyle = js { textAlign = "center" }
            icon {
                attrs {
                    type = "smile"
                    style = js { fontSize = 20 }
                }
            }
            p { +"Data Not Found" }
        }
    }
}

private val customStyle = js { width = 200 }

interface ConfigProviderDemoState : RState {
    var customize: Boolean
}

class ConfigProviderDemo : RComponent<RProps, ConfigProviderDemoState>() {
    override fun ConfigProviderDemoState.init() {
        customize = false
    }

    override fun RBuilder.render() {
        div {
            switch {
                attrs {
                    unCheckedChildren = "default"
                    checkedChildren = "customize"
                    checked = state.customize
                    onChange = { checked, _ ->
                        setState {
                            customize = checked
                        }
                    }
                }
            }
            divider {}
            configProvider {
                attrs.renderEmpty = if (state.customize) customizeRenderEmpty else null
                div {
                    attrs.classes = setOf("config-provider")
                    h3 { +"Select" }
                    select<String, SelectComponent<String>> {
                        attrs.style = customStyle
                    }
                    h3 { +"TreeSelect" }
                    treeSelect<String, TreeSelectComponent<String>> {
                        attrs {
                            style = customStyle
                            treeData = emptyArray()
                        }
                    }
                    h3 { +"Cascader" }
                    cascader {
                        attrs {
                            style = customStyle
                            options = emptyArray()
                            showSearch = true
                        }
                    }
                    h3 { +"Transfer" }
                    transfer {}
                    h3 { +"Table" }
                    table<Any, TableComponent<Any>> {
                        attrs {
                            style = js { marginTop = 8 }
                            columns = arrayOf(
                                jsObject {
                                    title = "Name"
                                    dataIndex = "name"
                                    key = "name"
                                },
                                jsObject {
                                    title = "Age"
                                    dataIndex = "age"
                                    key = "age"
                                }
                            )
                        }
                    }
                    h3 { +"List" }
                    list<Any, ListComponent<Any>> {}
                }
            }
        }
    }
}

fun RBuilder.configProviderDemo() = child(ConfigProviderDemo::class) {}

fun RBuilder.configProvider() {
    styledDiv {
        css { +EmptyStyles.configProvider }
        configProviderDemo()
    }
}
