package samples.form

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("samples-header") {
            h1 { +"Examples" }
        }
        div("samples-content") {
            horizontalLogin()
            normalLogin()
            register()
            advancedSearch()
            formInModal()
            dynamicFormItem()
            timeRelatedControls()
            customizedFormControls()
            withoutFormCreate()
            validateStatic()
            coordinated()
            layout()
            dynamicRule()
            validateOther()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
