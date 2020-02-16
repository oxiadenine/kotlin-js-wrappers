package samples.descriptions

import react.*
import react.dom.*

class DescriptionsApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Descriptions" }
        div {
            basic()
            border()
            size()
            responsive()
            vertical()
            verticalBorder()
        }
    }
}

fun RBuilder.descriptionsApp() = child(DescriptionsApp::class) {}
