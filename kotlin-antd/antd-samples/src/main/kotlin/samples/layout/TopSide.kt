package samples.layout

import antd.breadcrumb.*
import antd.icon.*
import antd.layout.*
import antd.layout.footer
import antd.layout.header
import antd.menu.*
import kotlinext.js.*
import react.*
import react.dom.*
import styled.*

fun RBuilder.topSide() {
    styledDiv {
        css { +LayoutStyles.topSide }
        layout {
            header {
                attrs.className = "header"
                div("logo") {}
                menu {
                    attrs {
                        theme = "dark"
                        mode = "horizontal"
                        defaultSelectedKeys = arrayOf("2")
                        style = js { lineHeight = "64px" }
                    }
                    menuItem {
                        attrs.key = "1"
                        +"nav 1"
                    }
                    menuItem {
                        attrs.key = "2"
                        +"nav 2"
                    }
                    menuItem {
                        attrs.key = "3"
                        +"nav 3"
                    }
                }
            }
            content {
                attrs.style = js { padding = "0 50px" }
                breadcrumb {
                    attrs.style = js { margin = "16px 0" }
                    breadcrumbItem { +"Home" }
                    breadcrumbItem { +"List" }
                    breadcrumbItem { +"App" }
                }
                layout {
                    attrs.style = js {
                        padding = "24px 0"
                        background = "#fff"
                    }
                    sider {
                        attrs {
                            width = 200
                            style = js { background = "#fff" }
                        }
                        menu {
                            attrs {
                                mode = "inline"
                                defaultSelectedKeys = arrayOf("1")
                                defaultOpenKeys = arrayOf("sub1")
                                style = js { height = "100%" }
                            }
                            subMenu {
                                attrs {
                                    key = "sub1"
                                    title = buildElement {
                                        span {
                                            userOutlined {}
                                            +"subnav 1"
                                        }
                                    }
                                }
                                menuItem {
                                    attrs.key = "1"
                                    +"option1"
                                }
                                menuItem {
                                    attrs.key = "2"
                                    +"option2"
                                }
                                menuItem {
                                    attrs.key = "3"
                                    +"option3"
                                }
                                menuItem {
                                    attrs.key = "4"
                                    +"option4"
                                }
                            }
                            subMenu {
                                attrs {
                                    key = "sub2"
                                    title = buildElement {
                                        span {
                                            laptopOutlined {}
                                            +"subnav 2"
                                        }
                                    }
                                }
                                menuItem {
                                    attrs.key = "5"
                                    +"option5"
                                }
                                menuItem {
                                    attrs.key = "6"
                                    +"option6"
                                }
                                menuItem {
                                    attrs.key = "7"
                                    +"option7"
                                }
                                menuItem {
                                    attrs.key = "8"
                                    +"option8"
                                }
                            }
                            subMenu {
                                attrs {
                                    key = "sub3"
                                    title = buildElement {
                                        span {
                                            notificationOutlined {}
                                            +"subnav 3"
                                        }
                                    }
                                }
                                menuItem {
                                    attrs.key = "9"
                                    +"option9"
                                }
                                menuItem {
                                    attrs.key = "10"
                                    +"option10"
                                }
                                menuItem {
                                    attrs.key = "11"
                                    +"option11"
                                }
                                menuItem {
                                    attrs.key = "12"
                                    +"option12"
                                }
                            }
                        }
                    }
                    content {
                        attrs.style = js {
                            padding = "0 24px"
                            minHeight = 280
                        }
                        +"Content"
                    }
                }
            }
            footer {
                attrs.style = js { textAlign = "center" }
                +"Ant Design ©2016 Created by Ant UED"
            }
        }
    }
}
