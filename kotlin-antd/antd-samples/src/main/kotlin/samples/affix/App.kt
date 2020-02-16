package samples.affix

import react.*
import react.dom.div
import react.dom.h2

class AffixApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Affix" }
        div {
            basic()
            onChange()
            target()
        }
    }
}

fun RBuilder.affixApp() = child(AffixApp::class) {}
