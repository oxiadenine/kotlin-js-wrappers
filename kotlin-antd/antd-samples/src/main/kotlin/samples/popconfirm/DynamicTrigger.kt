package samples.popconfirm

import antd.MouseEvent
import antd.message.message
import antd.popconfirm.popconfirm
import antd.switch.switch
import org.w3c.dom.HTMLElement
import react.*
import react.dom.a
import react.dom.br
import react.dom.div
import styled.css
import styled.styledDiv

external interface DynamicTriggerAppState : State {
    var visible: Boolean
    var condition: Boolean
}

class DynamicTriggerApp : RComponent<Props, DynamicTriggerAppState>() {
    private val changeCondition = fun(value: Boolean, _: org.w3c.dom.events.MouseEvent) {
        setState {
            condition = value
        }
    }

    private val confirm = fun(_: MouseEvent<HTMLElement>?) {
        setState {
            visible = false
        }

        message.success("Next step.")
    }

    private val cancel = fun(_: MouseEvent<HTMLElement>?) {
        setState {
            visible = false
        }

        message.success("Click on cancel.")
    }

    private val handleVisibleChange = fun(newVisible: Boolean, e: MouseEvent<HTMLElement>?) {
        if (!newVisible) {
            setState {
                visible = newVisible
            }

            return
        }

        console.log(state.condition)

        if (state.condition) {
            e?.let { confirm(it) }// next step
        } else {
            setState {
                visible = newVisible // show the popconfirm
            }
        }
    }

    override fun DynamicTriggerAppState.init() {
        visible = false
        condition = true
    }

    override fun RBuilder.render() {
        div {
            popconfirm {
                attrs {
                    title = "Are you sure delete this task?"
                    visible = state.visible
                    onVisibleChange = handleVisibleChange
                    onConfirm = confirm
                    onCancel = cancel
                    okText = "Yes"
                    cancelText = "No"
                }
                a {
                    attrs.href = "#"
                    +"Delete a task"
                }
            }
            br {}
            br {}
            +"Whether directly execute："
            switch {
                attrs {
                    defaultChecked = true
                    onChange = changeCondition
                }
            }
        }
    }
}

fun RBuilder.dynamicTriggerApp() = child(DynamicTriggerApp::class) {}

fun RBuilder.dynamicTrigger() {
    styledDiv {
        css { +PopconfirmStyles.dynamicTrigger }
        dynamicTriggerApp()
    }
}
