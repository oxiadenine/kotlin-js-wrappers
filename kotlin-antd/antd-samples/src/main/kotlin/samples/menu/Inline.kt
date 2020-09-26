package samples.menu

import antd.icon.icon
import antd.menu.*
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

class InlineSider : RComponent<RProps, RState>() {
    private val handleClick = fun (param: ClickParam) {
        console.log("click ", param)
    }

    override fun RBuilder.render() {
        menu {
            attrs {
                onClick = handleClick
                style = js { width = 256 }
                defaultSelectedKeys = arrayOf("1")
                defaultOpenKeys = arrayOf("sub1")
                mode = "inline"
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
                menuItemGroup {
                    attrs {
                        key = "g1"
                        title = "Item 1"
                    }
                    menuItem {
                        attrs.key = "1"
                        +"Option 1"
                    }
                    menuItem {
                        attrs.key = "2"
                        +"Option 2"
                    }
                }
                menuItemGroup {
                    attrs {
                        key = "g2"
                        title = "Item 2"
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

fun RBuilder.inlineSider() = child(InlineSider::class) {}

fun RBuilder.inline() {
    styledDiv {
        css { +MenuStyles.inline }
        inlineSider()
    }
}
