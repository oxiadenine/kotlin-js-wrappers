package samples.menu

import antd.icon.icon
import antd.menu.*
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

interface SiderCurrentSiderState : RState {
    var openKeys: Array<String>
}

class SiderCurrentSider : RComponent<RProps, SiderCurrentSiderState>() {
    private val rootSubmenuKeys = arrayOf("sub1", "sub2", "sub4")

    private val handleOpenChange = fun (keys: Array<String>) {
        val latestOpenKey = keys.find { key -> !state.openKeys.contains(key) }

        if (!rootSubmenuKeys.contains(latestOpenKey)) {
            setState { openKeys = keys }
        } else {
            setState {
                openKeys = if (latestOpenKey != null) arrayOf(latestOpenKey) else emptyArray()
            }
        }
    }

    override fun SiderCurrentSiderState.init() {
        openKeys = arrayOf("sub1")
    }

    override fun RBuilder.render() {
        menu {
            attrs {
                mode = "inline"
                openKeys = state.openKeys
                onOpenChange = handleOpenChange
                style = js { width = 256 }
            }
            subMenu {
                attrs {
                    key = "sub1"
                    title = buildElement {
                        span {
                            icon {
                                attrs.type = "mail"
                            }
                            span { +"Navigation One" }
                        }
                    }
                }
                menuItem {
                    attrs.key = "1"
                    +"Option 1"
                }
                menuItem {
                    attrs.key = "2"
                    +"Option 2"
                }
                menuItem {
                    attrs.key = "3"
                    +"Option 3"
                }
                menuItem {
                    attrs.key = "4"
                    +"Option 4"
                }
            }
            subMenu {
                attrs {
                    key = "sub2"
                    title = buildElement {
                        span {
                            icon {
                                attrs.type = "appstore"
                            }
                            span { +"Navigation Two" }
                        }
                    }
                }
                menuItem {
                    attrs.key = "5"
                    +"Option 5"
                }
                menuItem {
                    attrs.key = "6"
                    +"Option 6"
                }
                subMenu {
                    attrs {
                        key = "sub3"
                        title = "SubMenu"
                    }
                    menuItem {
                        attrs.key = "7"
                        +"Option 7"
                    }
                    menuItem {
                        attrs.key = "8"
                        +"Option 8"
                    }
                }
            }
            subMenu {
                attrs {
                    key = "sub4"
                    title = buildElement {
                        span {
                            icon {
                                attrs.type = "setting"
                            }
                            span { +"Navigation Three" }
                        }
                    }
                }
                menuItem {
                    attrs.key = "9"
                    +"Option 9"
                }
                menuItem {
                    attrs.key = "10"
                    +"Option 10"
                }
                menuItem {
                    attrs.key = "11"
                    +"Option 11"
                }
                menuItem {
                    attrs.key = "12"
                    +"Option 12"
                }
            }
        }
    }
}

fun RBuilder.siderCurrentSider() = child(SiderCurrentSider::class) {}

fun RBuilder.siderCurrent() {
    div("menu-container") {
        attrs.id = "menu-sider-current"
        siderCurrentSider()
    }
}
