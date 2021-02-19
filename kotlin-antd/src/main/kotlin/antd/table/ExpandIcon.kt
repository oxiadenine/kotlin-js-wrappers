package antd.table

import antd.MouseEvent
import org.w3c.dom.HTMLElement
import react.ReactElement

external fun renderExpandIcon(locale: TableLocale): ReactElement?

external interface DefaultExpandIconProps<RecordType> {
    var prefixCls: String
    var onExpand: (record: RecordType, e: MouseEvent<HTMLElement>) -> Unit
    var record: RecordType
    var expanded: Boolean
    var expandable: Boolean
}
