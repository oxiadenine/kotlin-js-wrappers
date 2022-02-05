package samples

import csstype.*
import react.*
import react.css.css
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
            children.apply {
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
            className = "uk-container"
            div {
                className = "uk-card uk-card-body uk-card-primary"
                h3 {
                    className = "uk-card-title"
                    +"Hello World"
                }
                button {
                    className = "uk-button uk-button-default uk-button-small"
                    onClick = {
                        val notification = UIkit.notification("Hello World!")

                        UIkit.util.on(notification.`$el`, NotificationEvents.close, listener = { e ->
                            console.log(e)
                        })
                    }
                    div {
                        className = "uk-flex-inline uk-flex-center uk-flex-middle"
                        css { width = 120.px }
                        span { +"Powered by" }
                        span {
                            className = "uk-margin-auto-left"
                            //attrs["uk-icon"] = "uikit"
                        }
                    }
                }
            }
        }
    }
}
