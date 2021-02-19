package antd.table

import react.*
import react.Component

external class ColumnComponent<RecordType> : Component<ColumnProps<RecordType>, RState> {
    override fun render(): ReactElement?
}

external interface ColumnProps<RecordType> : ColumnType<RecordType>, RProps {
    var children: dynamic
}
