package antd.typography

import react.*

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
