package samples.menu

import antd.icon.icon
import antd.menu.*
import kotlinext.js.js
import kotlinx.html.id
import react.*
import react.dom.*

private fun handleClick(param: ClickParam) {
    console.log("click ", param)
}

fun RBuilder.vertical() {
    div("menu-container") {
        attrs.id = "menu-vertical"
        menu {
            attrs {
                onClick = ::handleClick
                style = js { width = 256 }
                mode = "vertical"
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
                    attrs.title = "Item 1"
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
                    attrs.title = "Item 2"
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
