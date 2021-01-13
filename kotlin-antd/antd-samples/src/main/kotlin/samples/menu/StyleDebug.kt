package samples.menu

import antd.icon.appstoreOutlined
import antd.icon.mailOutlined
import antd.menu.*
import antd.switch.switch
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.br
import react.dom.span
import styled.css
import styled.styledDiv


interface StyleDebugState : RState {
    var theme: MenuTheme
    var current: String
}

class StyleDebug : RComponent<RProps, StyleDebugState>() {
    private val changeTheme = fun(checked: Boolean, _: MouseEvent) {
        setState {
            theme = if (checked) "dark" else "light"
        }
    }

    private val handleClick = fun(param: ClickParam) {
        console.log("click ", param)

        setState {
            current = param.key
        }
    }

    override fun StyleDebugState.init() {
        theme = "dark"
        current = "1"
    }

    override fun RBuilder.render() {
        br {}
        switch {
            attrs {
                checked = state.theme == "dark"
                onChange = changeTheme
                checkedChildren = "Dark"
                unCheckedChildren = "Light"
            }
        }
        br {}
        br {}
        menu {
            attrs {
                theme = state.theme
                onClick = handleClick
                selectedKeys = arrayOf(state.current)
                mode = "horizontal"
            }
            subMenu {
                attrs {
                    key = "sub1"
                    title = buildElement {
                        span {
                            mailOutlined {}
                            span { +"Navigation One Long Long Long Long" }
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
                        appstoreOutlined {}
                        span { +"Navigation Two" }
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
                        title = buildElement {
                            span {
                                +"Submenu"
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
                }
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

fun RBuilder.styleDebugChild() = child(StyleDebug::class) {}

fun RBuilder.styleDebug() {
    styledDiv {
        css { +MenuStyles.styleDebug }
        styleDebugChild()
    }
}
