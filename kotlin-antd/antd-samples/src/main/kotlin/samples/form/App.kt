package samples.form

import kotlinx.css.*
import kotlinx.css.properties.*
import react.*
import react.dom.*
import styled.*

object FormStyles : StyleSheet("form", isStatic = true) {
    val container by css {}
    val horizontalLogin by css {}
    val normalLogin by css {
        descendants(".login-form") {
            maxWidth = 300.px
        }
        descendants(".login-form-forgot") {
            float = Float.right
        }
    }
    val register by css {}
    val advancedSearch by css {
        descendants(".ant-advanced-search-form") {
            padding(all = 24.px)
            background = "#fbfbfb"
            border(1.px, BorderStyle.solid, Color("#d9d9d9"))
            borderRadius = 6.px
            descendants(".ant-form-item") {
                display = Display.flex
            }
            descendants(".ant-form-item-control-wrapper") {
                flex(1.0, 1.0, 0.px)
            }
        }
        descendants(".ant-form") {
            maxWidth = LinearDimension.none
        }
        descendants(".search-result-list") {
            minHeight = 200.px
            marginTop = 16.px
            paddingTop = 80.px
            backgroundColor = Color("#fafafa")
            border(1.px, BorderStyle.dashed, Color("#e9e9e9"))
            textAlign = TextAlign.center
        }
    }
    val fornInModal by css {
        descendants(".collection-create-form_last-form-item") {
            marginBottom = 0.px
        }
    }
    val dynamicFormItem by css {
        descendants(".dynamic-delete-button") {
            position = Position.relative
            top = 4.px
            color = Color("#999")
            fontSize = 24.px
            cursor = Cursor.pointer
            transition(duration = 3.s)
        }
        descendants(".dynamic-delete-button") {
            hover {
                color = Color("#777")
            }
            disabled {
                opacity = 0.5
                cursor = Cursor.notAllowed
            }
        }
    }
    val timeRelatedControls by css {}
    val customizedFormControls by css {}
    val withoutFormCreate by css {}
    val validateStatic by css {}
    val coordinated by css {}
    val layout by css {}
    val dynamicRule by css {}
    val validateOther by css {}
}

class FormApp : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        h2 { +"Form" }
        styledDiv {
            css { +FormStyles.container }
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
