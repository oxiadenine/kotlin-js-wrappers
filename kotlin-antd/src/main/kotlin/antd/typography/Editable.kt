package antd.typography

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object EditableComponent : Component<EditableProps, EditableState> {
    override fun render(): ReactElement?
}

external interface EditableProps : RProps {
    var prefixCls: String?
    var value: String?
    /* ["aria-label"]: String? */
    var onSave: (value: String) -> Unit
    var onCancel: () -> Unit
    var className: String?
    var style: dynamic
}

external interface EditableState : RState {
    var current: String
    var prevValue: String?
}
