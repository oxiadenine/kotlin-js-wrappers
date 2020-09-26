package samples.menu

import antd.icon.icon
import antd.menu.*
import antd.switch.switch
import kotlinext.js.js
import kotlinx.html.classes
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

interface SwitchModeSiderState : RState {
    var mode: MenuMode
    var theme: MenuTheme
}

class SwitchModeSider : RComponent<RProps, SwitchModeSiderState>() {
    private val changeMode = fun (checked: Boolean, _: MouseEvent) {
        setState {
            mode = if (checked) "vertical" else "inline"
        }
    }

    private val changeTheme = fun (checked: Boolean, _: MouseEvent) {
        setState {
            theme = if (checked) "dark" else "light"
        }
    }

    override fun SwitchModeSiderState.init() {
        mode = "inline"
        theme = "light"
    }

    override fun RBuilder.render() {
        div {
            switch {
                attrs.onChange = changeMode
            }
            +" Change Mode"
            span {
                attrs {
                    classes = setOf("ant-divider")
                    jsStyle = js { margin = "0 1em" }
                }
            }
            switch {
                attrs.onChange = changeTheme
            }
            +" Change Theme"
            br {}
            br {}
            menu {
                attrs {
                    style = js { width = 256 }
                    defaultSelectedKeys = arrayOf("1")
                    defaultOpenKeys = arrayOf("sub1")
                    mode = state.mode
                    theme = state.theme
                }
                menuItem {
                    attrs.key = "1"
                    icon {
                        attrs.type = "mail"
                    }
                    +"Navigation One"
                }
                menuItem {
                    attrs.key = "2"
                    icon {
                        attrs.type = "calendar"
                    }
                    +"Navigation Two"
                }
                subMenu {
                    attrs {
                        key = "sub1"
                        title = buildElement {
                            span {
                                icon {
                                    attrs.type = "appstore"
                                }
                                span { +"Navigation Three" }
                            }
                        }
                    }
                    menuItem {
                        attrs.key = "3"
                        +"Option 3"
                    }
                    menuItem {
                        attrs.key = "4"
                        +"Option 4"
                    }
                    subMenu {
                        attrs {
                            key = "sub1-2"
                            title = "Submenu"
                        }
                        menuItem {
                            attrs.key = "5"
                            +"Option 5"
                        }
                        menuItem {
                            attrs.key = "6"
                            +"Option 6"
                        }
                    }
                }
                subMenu {
                    attrs {
                        key = "sub2"
                        title = buildElement {
                            span {
                                icon {
                                    attrs.type = "setting"
                                }
                                span { +"Navigation Four" }
                            }
                        }
                    }
                    menuItem {
                        attrs.key = "7"
                        +"Option 7"
                    }
                    menuItem {
                        attrs.key = "8"
                        +"Option 8"
                    }
                    menuItem {
                        attrs.key = "9"
                        +"Option 9"
                    }
                    menuItem {
                        attrs.key = "10"
                        +"Option 10"
                    }
                }
            }
        }
    }
}

fun RBuilder.switchModeSider() = child(SwitchModeSider::class) {}

fun RBuilder.switchMode() {
    styledDiv {
        css { +MenuStyles.switchMode }
        switchModeSider()
    }
}
