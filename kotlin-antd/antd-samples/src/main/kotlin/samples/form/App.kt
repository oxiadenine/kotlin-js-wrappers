package samples.form

import kotlinx.css.*
import kotlinx.css.properties.border
import react.RBuilder
import react.RComponent
import react.RProps
import react.State
import react.dom.h2
import styled.StyleSheet
import styled.css
import styled.styledDiv

object FormStyles : StyleSheet("form", isStatic = true) {
    val container by css {}
    val basic by css {}
    val controlHooks by css {
        descendants(".ant-btn") {
            marginRight = 8.px
        }
    }
    val controlRef by css {
        descendants(".ant-btn") {
            marginRight = 8.px
        }
    }
    val layout by css {}
    val requiredMark by css {}
    val size by css {}
    val nestMessages by css {}
    val normalLogin by css {
        descendants(".login-form") {
            maxWidth = 300.px
        }
        descendants(".login-form-forgot") {
            float = Float.right
        }
        descendants(".ant-col-rtl") {
            descendants(".login-form-forgot") {
                float = Float.left
            }
        }
        descendants(".login-form-button") {
            width = LinearDimension("100%")
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
    val timeRelatedControls by css {}
    val withoutFormCreate by css {}
    val validateStatic by css {}
    val dynamicRule by css {}
    val validateOther by css {}
}

class FormApp : RComponent<RProps, State>() {
    override fun RBuilder.render() {
        h2 { +"Form" }
        styledDiv {
            css { +FormStyles.container }
            basic()
            controlHooks()
            controlRef()
            layout()
            requiredMark()
            size()
            nestMessages()
            normalLogin()
            register()
            advancedSearch()
            timeRelatedControls()
            withoutFormCreate()
            validateStatic()
            dynamicRule()
            validateOther()
        }
    }
}

fun RBuilder.formApp() = child(FormApp::class) {}
