package samples

import kotlinx.css.*
import kotlinx.html.*
import kotlinx.html.js.*
import react.*
import react.dom.*
import styled.*
import uikit.*
import uikit.components.*

object AppStyles : StyleSheet("app", isStatic = true) {
    val header by css {
        padding(all = 10.px)
        textAlign = TextAlign.center
    }
    val content by css {
        display = Display.flex
        flexDirection = FlexDirection.column
        justifyContent = JustifyContent.center
        alignItems = Align.center
        padding(all = 10.px)
        children("*") {
            margin(all = 20.px)
        }
    }
}

class App : RComponent<Props, State>() {
    override fun RBuilder.render() {
        styledDiv {
            css { +AppStyles.header }
            h1 { +"Examples" }
        }
        styledDiv {
            css { +AppStyles.content }
            div {
                attrs.classes = setOf("uk-container")
                div {
                    attrs.classes = setOf("uk-card", "uk-card-body", "uk-card-primary")
                    h3 {
                        attrs.classes = setOf("uk-card-title")
                        +"Hello World"
                    }
                    button {
                        attrs {
                            classes = setOf("uk-button", "uk-button-default", "uk-button-small")
                            onClickFunction = {
                                val notification = UIkit.notification("Hello World!")

                                UIkit.util.on(notification.`$el`, NotificationEvents.close, listener = { e ->
                                    console.log(e)
                                })
                            }
                        }
                        styledDiv {
                            attrs.classes = setOf("uk-flex-inline", "uk-flex-center", "uk-flex-middle")
                            css { width = 120.px }
                            span { +"Powered by" }
                            span {
                                attrs.classes = setOf("uk-margin-auto-left")
                                attrs["uk-icon"] = "uikit"
                            }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
