package samples.skeleton

import antd.divider.divider
import antd.form.form
import antd.form.formItem
import antd.radio.RadioChangeEvent
import antd.radio.radioButton
import antd.radio.radioGroup
import antd.skeleton.skeletonAvatar
import antd.skeleton.skeletonButton
import antd.skeleton.skeletonImage
import antd.skeleton.skeletonInput
import antd.space.space
import antd.switch.switch
import kotlinext.js.js
import org.w3c.dom.events.MouseEvent
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.br
import react.setState
import styled.css
import styled.styledDiv

private external interface DemoState : RState {
    var active: Boolean
    var size: String
    var buttonShape: String
    var avatarShape: String
}

private class Demo : RComponent<RProps, DemoState>() {
    val handleActiveChange = { checked: Boolean, _: MouseEvent ->
        setState { active = checked }
    }

    val handleSizeChange = { e: RadioChangeEvent ->
        setState { size = e.target.value.unsafeCast<String>() }
    }

    val handleShapeChange =  { prop: String, e: RadioChangeEvent ->
        val newState: dynamic = object {}

        newState["active"] = state.active
        newState["size"] = state.size
        newState[prop] = e.target.value.unsafeCast<String>()

        setState(newState.unsafeCast<DemoState>())
    }

    override fun DemoState.init() {
        active = false
        size = "default"
        buttonShape = "default"
        avatarShape = "circle"
    }

    override fun RBuilder.render() {
        space {
            skeletonButton {
                attrs {
                    active = state.active
                    size = state.size
                    shape = state.buttonShape
                }
            }
            skeletonButton {
                attrs {
                    active = state.active
                    size = state.size
                    shape = state.buttonShape
                }
            }
            skeletonAvatar {
                attrs {
                    active = state.active
                    size = state.size
                    shape = state.avatarShape
                }
            }
            skeletonInput {
                attrs {
                    style = js { width = 200 }
                    active = state.active
                    size = state.size
                }
            }
        }
        br {}
        br {}
        skeletonImage {}
        divider {}
        form {
            attrs {
                layout = "inline"
                style = js { margin = "16px 0" }
            }
            formItem {
                switch {
                    attrs {
                        checked = state.active
                        onChange = handleActiveChange
                    }
                }
            }
            formItem {
                attrs.label = "size"
                radioGroup {
                    attrs {
                        value = state.size
                        onChange = handleSizeChange
                    }
                    radioButton {
                        attrs.value = "default"
                        +"Default"
                    }
                    radioButton {
                        attrs.value = "large"
                        +"Large"
                    }
                    radioButton {
                        attrs.value = "small"
                        +"Small"
                    }
                }
            }
            formItem {
                attrs.label = "Button Shape"
                radioGroup {
                    attrs {
                        value = state.buttonShape
                        onChange = {
                            handleShapeChange("buttonShape", it)
                        }
                    }
                    radioButton {
                        attrs.value = "default"
                        +"Default"
                    }
                    radioButton {
                        attrs.value = "round"
                        +"Round"
                    }
                    radioButton {
                        attrs.value = "circle"
                        +"Circle"
                    }
                }
            }
            formItem {
                attrs.label = "Avatar Shape"
                radioGroup {
                    attrs {
                        value = state.avatarShape
                        onChange = {
                            handleShapeChange("avatarShape", it)
                        }
                    }
                    radioButton {
                        attrs.value = "square"
                        +"Square"
                    }
                    radioButton {
                        attrs.value = "circle"
                        +"Circle"
                    }
                }
            }
        }
    }
}

private fun RBuilder.demo() = child(Demo::class) {}

fun RBuilder.element() {
    styledDiv {
        css { +SkeletonStyles.element }
        demo()
    }
}
