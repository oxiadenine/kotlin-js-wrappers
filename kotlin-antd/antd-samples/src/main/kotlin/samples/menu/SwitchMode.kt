package samples.menu

import antd.icon.appstoreOutlined
import antd.icon.calendarOutlined
import antd.icon.mailOutlined
import antd.icon.settingOutlined
import antd.menu.*
import antd.switch.switch
import kotlinext.js.js
import kotlinx.css.em
import kotlinx.css.margin
import kotlinx.css.px
import kotlinx.html.classes
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.br
import react.dom.div
import react.dom.span
import styled.css
import styled.styledDiv
import styled.styledSpan

external interface SwitchModeSiderState : State {
    var mode: MenuMode
    var theme: MenuTheme
}

class SwitchModeSider : RComponent<Props, SwitchModeSiderState>() {
    private val changeMode = fun(checked: Boolean, _: MouseEvent) {
        setState {
            mode = if (checked) "vertical" else "inline"
        }
    }

    private val changeTheme = fun(checked: Boolean, _: MouseEvent) {
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
            styledSpan {
                attrs.classes = setOf("ant-divider")
                css { margin(0.px, 1.em) }
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
                    mailOutlined {}
                    +"Navigation One"
                }
                menuItem {
                    attrs.key = "2"
                    calendarOutlined {}
                    +"Navigation Two"
                }
                subMenu {
                    attrs {
                        key = "sub1"
                        title = buildElement {
                            span {
                                appstoreOutlined {}
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
                                settingOutlined {}
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
