package antd.table

import react.*
import react.Component

external class ColumnGroupComponent<RecordType> : Component<ColumnGroupProps<RecordType>, RState> {
    override fun render(): ReactElement?
}

external interface ColumnGroupProps<RecordType> : ColumnType<RecordType>, RProps {
    var children: Any /* ReactElement | Array<ReactElement> */
}
