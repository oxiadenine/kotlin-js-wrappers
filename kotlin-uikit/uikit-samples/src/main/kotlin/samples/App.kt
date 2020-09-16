package samples

import kotlinext.js.js
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import uikit.UIkit

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("app-header") {
            h1 { +"Examples" }
        }
        div("app-content") {
            div(classes = "uk-container") {
                div(classes = "uk-card uk-card-body uk-card-primary") {
                    h3(classes = "uk-card-title") { +"Hello World" }
                    button(classes = "uk-button uk-button-default uk-button-small") {
                        attrs.onClickFunction = {
                            UIkit.notification("Hello World!")
                        }
                        div(classes = "uk-flex-inline uk-flex-center uk-flex-middle") {
                            attrs.jsStyle = js { width = 120 }
                            span { +"Powered by" }
                            span(classes = "uk-margin-auto-left") {
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
