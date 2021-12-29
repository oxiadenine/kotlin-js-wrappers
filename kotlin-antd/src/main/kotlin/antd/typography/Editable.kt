package antd.typography

import antd.configprovider.DirectionType
import react.*

external interface EditableComponent : ComponentClass<EditableProps>

external interface EditableProps : Props {
    var prefixCls: String?
    var value: String?
    var onSave: (value: String) -> Unit
    var onCancel: () -> Unit
    var className: String?
    var style: dynamic
    var direction: DirectionType?
    var maxLength: Number?
    var autoSize: Any? /* Boolean | AutoSizeType */
}
