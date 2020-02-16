package samples.typography

import react.*
import react.dom.*

class TypographyApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Typography" }
        div {
            basic()
            title()
            text()
            interactive()
            ellipsis()
        }
    }
}

fun RBuilder.typographyApp() = child(TypographyApp::class) {}
