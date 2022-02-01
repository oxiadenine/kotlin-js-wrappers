package samples.tag

import antd.*
import antd.icon.*
import antd.input.input
import antd.tag.*
import antd.tooltip.*
import kotlinext.js.*
import org.w3c.dom.*
import react.*
import react.ReactNode
import react.dom.div
import styled.*

external interface ControlEditableTagGroupState : State {
    var tags: Array<String>
    var inputVisible: Boolean
    var inputValue: String
}

class ControlEditableTagGroup : RComponent<Props, ControlEditableTagGroupState>() {
    private var input: dynamic = null

    private val handleClose: (String) -> Unit = { removedTag ->
        val filteredTags = state.tags.filter { tag -> tag != removedTag }.toTypedArray()

        console.log(filteredTags)

        setState {
            tags = filteredTags
        }
    }

    private val showInput: MouseEventHandler<HTMLDivElement> = {
        setState(jso<ControlEditableTagGroupState> {
            inputVisible = true
        }) {
            input?.focus().unsafeCast<Function<Unit>>()
        }
    }

    private val handleInputChange: ChangeEventHandler<HTMLInputElement> = { e ->
        e.persist()

        setState {
            inputValue = e.target.asDynamic().value.unsafeCast<String>()
        }
    }

    private val handleInputConfirm: () -> Unit = {
        var newTags = emptyArray<String>()

        if (state.inputValue.isNotEmpty() && state.tags.indexOf(state.inputValue) == -1) {
            newTags = state.tags.plus(state.inputValue)
        }

        console.log(newTags)

        setState {
            tags = newTags
            inputVisible = false
            inputValue = ""
        }
    }

    override fun ControlEditableTagGroupState.init() {
        tags = arrayOf("Unremovable", "Tag 2", "Tag 3")
        inputVisible = false
        inputValue = ""
    }

    override fun RBuilder.render() {
        div {
            state.tags.mapIndexed { index, tag ->
                val isLongTag = tag.length > 20
                val tagElem = tag {
                    attrs {
                        key = tag
                        closable = index != 0
                        onClose = { handleClose(tag) }
                    }
                    if (isLongTag) {
                        +"${tag.slice(0..20)}..."
                    } else {
                        +tag
                    }
                }
                if (isLongTag) {
                    tooltip {
                        attrs {
                            title = tag
                            key = tag
                        }
                        childList.add(tagElem.unsafeCast<ReactNode>())
                    }
                }
            }.toTypedArray()
            if (state.inputVisible) {
                input {
                    ref = input
                    attrs {
                        type = "text"
                        size = "small"
                        style = js { width = 78 }
                        value = state.inputValue
                        onChange = handleInputChange
                        onBlur = { handleInputConfirm() }
                        onPressEnter = { handleInputConfirm() }
                    }
                }
            } else {
                tag {
                    attrs {
                        onClick = showInput
                        style = js {
                            background = "#fff"
                            borderStyle = "dashed"
                        }
                    }
                    plusOutlined {}
                    +" New Tag "
                }
            }
        }
    }
}

fun RBuilder.controlEditableTagGroup() = child(ControlEditableTagGroup::class) {}

fun RBuilder.control() {
    styledDiv {
        css { +TagStyles.control }
        controlEditableTagGroup()
    }
}
