package antd.table

import react.*

external interface ColumnGroupComponent<RecordType> : ComponentType<ColumnGroupProps<RecordType>>

external interface ColumnGroupProps<RecordType> : ColumnType<RecordType>, RProps {
    var children: Any /* ReactElement | Array<ReactElement> */
}
