package samples.checkbox

import antd.checkbox.CheckboxChangeEvent
import antd.checkbox.CheckboxValueType
import antd.checkbox.checkbox
import antd.checkbox.checkboxGroup
import kotlinx.css.BorderStyle
import kotlinx.css.Color
import kotlinx.css.properties.borderBottom
import kotlinx.css.px
import react.*
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

private val plainOptions: Array<CheckboxValueType> = arrayOf("Apple", "Pear", "Orange")
private val defaultCheckedList: Array<CheckboxValueType> = arrayOf("Apple", "Orange")

external interface CheckAllAppState : State {
    var checkedList: Array<CheckboxValueType>
    var indeterminate: Boolean
    var checkAll: Boolean
}

class CheckAllApp : RComponent<Props, CheckAllAppState>() {
    private val handleGroupChange = fun(checkedValues: Array<CheckboxValueType>) {
        setState {
            checkedList = checkedValues
            indeterminate = checkedValues.isNotEmpty() && (checkedValues.size < plainOptions.size)
            checkAll = checkedValues.size == plainOptions.size
        }
    }

    private val handleCheckAllChange = fun(event: CheckboxChangeEvent?) {
        setState {
            checkedList = if (event?.target?.checked!!) plainOptions else emptyArray()
            indeterminate = false
            checkAll = event.target.checked!!
        }
    }

    override fun CheckAllAppState.init() {
        checkedList = defaultCheckedList
        indeterminate = true
        checkAll = false
    }

    override fun RBuilder.render() {
        div {
            styledDiv {
                css { borderBottom(1.px, BorderStyle.solid, Color("#E9E9E9")) }
                checkbox {
                    attrs {
                        indeterminate = state.indeterminate
                        onChange = handleCheckAllChange
                        checked = state.checkAll
                    }
                    +"Check all"
                }
            }
            br {}
            checkboxGroup {
                attrs {
                    options = plainOptions.unsafeCast<Array<Any>>()
                    value = state.checkedList
                    onChange = handleGroupChange
                }
            }
        }
    }
}

fun RBuilder.checkAllApp() = child(CheckAllApp::class) {}

fun RBuilder.checkAll() {
    styledDiv {
        css { +CheckboxStyles.checkAll }
        checkAllApp()
    }
}
