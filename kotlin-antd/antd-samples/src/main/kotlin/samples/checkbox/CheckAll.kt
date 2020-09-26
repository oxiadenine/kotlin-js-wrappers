package samples.checkbox

import antd.checkbox.*
import kotlinext.js.js
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val plainOptions: Array<CheckboxValueType> = arrayOf("Apple", "Pear", "Orange")
private val defaultCheckedList: Array<CheckboxValueType> = arrayOf("Apple", "Orange")

interface CheckAllAppState : RState {
    var checkedList: Array<CheckboxValueType>
    var indeterminate: Boolean
    var checkAll: Boolean
}

class CheckAllApp : RComponent<RProps, CheckAllAppState>() {
    private val handleGroupChange = fun (checkedValues: Array<CheckboxValueType>) {
        setState {
            checkedList = checkedValues
            indeterminate = checkedValues.isNotEmpty() && (checkedValues.size < plainOptions.size)
            checkAll = checkedValues.size == plainOptions.size
        }
    }

    private val handleCheckAllChange = fun (event: CheckboxChangeEvent?) {
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
            div {
                attrs.jsStyle = js { borderBottom = "1px solid #E9E9E9" }
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
