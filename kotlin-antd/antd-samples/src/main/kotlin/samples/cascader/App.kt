package samples.cascader

import react.*
import react.dom.*

class CascaderApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Cascader" }
        div {
            basic()
            customTrigger()
            disabledOption()
            size()
            search()
            fieldNames()
            defaultValue()
            hover()
            changeOnSelection()
            customRender()
            lazy()
            suffix()
        }
    }
}

fun RBuilder.cascaderApp() = child(CascaderApp::class) {}
