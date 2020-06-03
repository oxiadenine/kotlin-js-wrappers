package samples.empty

import antd.cascader.cascader
import antd.configprovider.RenderEmptyHandler
import antd.configprovider.configProvider
import antd.divider.divider
import antd.icon.icon
import antd.list.ListComponent
import antd.list.list
import antd.select.SelectComponent
import antd.select.select
import antd.switch.switch
import antd.table.TableComponent
import antd.table.table
import antd.transfer.transfer
import antd.treeselect.TreeSelectComponent
import antd.treeselect.treeSelect
import kotlinext.js.js
import kotlinext.js.jsObject
import kotlinx.html.classes
import kotlinx.html.id
import react.*
import react.dom.*

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
                    onChange = {  checked, _ ->
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
    div("empty-container") {
        attrs.id = "empty-config-provider"
        configProviderDemo()
    }
}
