package samples

import csstype.*
import emotion.react.css
import react.*
import react.dom.html.ReactHTML.button
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h1
import react.dom.html.ReactHTML.h3
import react.dom.html.ReactHTML.span
import uikit.*
import uikit.components.*

val App = FC<Props> {
    div {
        css {
            padding = 10.px
            textAlign = TextAlign.center
            "> *" {
                margin = 20.px
            }
        }
        h1 { +"Examples" }
    }
    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
            padding = 10.px
        }
        div {
            className = ClassName("uk-container")
            div {
                className = ClassName("uk-card uk-card-body uk-card-primary")
                h3 {
                    className = ClassName("uk-card-title")
                    +"Hello World"
                }
                button {
                    className = ClassName("uk-button uk-button-default uk-button-small")
                    onClick = {
                        val notification = UIkit.notification("Hello World!")

                        UIkit.util.on(notification.`$el`, NotificationEvents.close, listener = { e ->
                            console.log(e)
                        })
                    }
                    div {
                        css(ClassName("uk-flex-inline uk-flex-center uk-flex-middle")) { width = 120.px }
                        span { +"Powered by" }
                        span {
                            className = ClassName("uk-margin-auto-left")

                            asDynamic()["uk-icon"] = "uikit"
                        }
                    }
                }
            }
        }
    }
}
