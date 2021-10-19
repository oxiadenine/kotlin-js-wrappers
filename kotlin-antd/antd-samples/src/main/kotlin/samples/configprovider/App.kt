package samples.configprovider

import kotlinx.css.*
import kotlinx.css.properties.border
import kotlinx.css.properties.borderTop
import react.RBuilder
import react.RComponent
import react.Props
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object ConfigProviderStyles : StyleSheet("config-provider", isStatic = true) {
    val container by css {}
    val locale by css {
        descendants(".site-config-provider-calendar-wrapper") {
            width = 319.px
            border(1.px, BorderStyle.solid, Color("#d9d9d9"))
            borderRadius = 2.px
        }
        descendants(".locale-components") {
            borderTop(1.px, BorderStyle.solid, Color("#d9d9d9"))
            paddingTop = 16.px
        }

        descendants(".code-box-demo") {
            descendants(".example") {
                margin(vertical = 16.px, horizontal = 0.px)
                children("*") {
                    marginRight = 8.px
                }
            }
        }
        descendants(".change-locale") {
            marginBottom = 16.px
        }
        descendants("[data-theme=\"dark\"] .locale-components") {
            borderTop(1.px, BorderStyle.solid, Color("#303030"))
        }
        descendants("[data-theme=\"dark\"] .site-config-provider-calendar-wrapper") {
            border(1.px, BorderStyle.solid, Color("#303030"))
        }
    }
    val direction by css {
        descendants(".button-demo") {
            descendants(".ant-btn") {
                marginRight = 8.px
                marginBottom = 12.px
            }
        }
        descendants(".button-demo") {
            descendants(".ant-btn-group") {
                marginRight = 8.px
                marginBottom = 12.px
                children(".ant-btn") {
                    marginRight = 0.px
                    marginLeft = 0.px
                }
                children(".span") {
                    children(".ant-btn") {
                        marginRight = 0.px
                        marginLeft = 0.px
                    }
                }
            }
        }
        descendants(".head-example") {
            display = Display.inlineBlock
            width = 42.px
            height = 42.px
            verticalAlign = VerticalAlign.middle
            background = "#eee"
            borderRadius = 4.px
        }
        descendants(".ant-badge") {
            not(".ant-badge-not-a-wrapper") {
                marginRight = 20.px
            }
        }
        descendants(".ant-badge-rtl") {
            not(".ant-badge-not-a-wrapper") {
                marginRight = 0.px
                marginLeft = 20.px
            }
        }
        descendants("[data-theme=\"dark\"] .head-example") {
            background = "rgba(255, 255, 255, .12)"
        }
    }
    val size by css {}
}

class ConfigProviderApp : RComponent<Props, State>() {
    override fun RBuilder.render() {
        h2 { +"ConfigProvider" }
        styledDiv {
            css { +ConfigProviderStyles.container }
            locale()
            direction()
            size()
        }
    }
}

fun RBuilder.configProviderApp() = child(ConfigProviderApp::class) {}
