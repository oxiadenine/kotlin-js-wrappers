package samples.localeprovider

import react.*
import react.dom.*

class LocaleProviderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"LocaleProvider (Deprecated)" }
        div {
            basic()
            all()
        }
    }
}

fun RBuilder.localeProviderApp() = child(LocaleProviderApp::class) {}
