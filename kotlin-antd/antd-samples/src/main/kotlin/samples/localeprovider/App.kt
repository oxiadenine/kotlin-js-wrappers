package samples.localeprovider

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object LocaleProviderStyles : StyleSheet("locale-provider", isStatic = true) {
    val container by css {}
    val basic by css {}
    val all by css {
        descendants(".locale-components") {
            paddingTop = 16.px
            borderTop(1.px, BorderStyle.solid, Color("#d9d9d9"))
        }
        descendants(".example") {
            margin(16.px, 0.px)
            children("*") {
                marginRight = 8.px
            }
        }
        descendants(".change-locale") {
            marginBottom = 16.px
        }
    }
}

class LocaleProviderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"LocaleProvider" }
        styledDiv {
            css { LocaleProviderStyles.container }
            basic()
            all()
        }
    }
}

fun RBuilder.localeProviderApp() = child(LocaleProviderApp::class) {}
