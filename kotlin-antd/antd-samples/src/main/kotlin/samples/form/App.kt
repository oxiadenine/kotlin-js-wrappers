package samples.form

import react.*
import react.dom.*

class FormApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Form" }
        div {
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

fun RBuilder.formApp() = child(FormApp::class) {}
