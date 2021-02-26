package antd.transfer

import antd.ReactNode

typealias TransferDirection = String /* "left" | "right" */
typealias RenderResult = Any /* ReactNode | RenderResultObject */
typealias KeyWiseTransferItem = Any /* TransferItem | KeyWise<TransferItem> */
typealias TransferRender<RecordType> = (item: RecordType) -> RenderResult
typealias SelectAllLabel = Any /* ReactNode | (info: SelectAllLabelInfo) -> ReactNode) */
typealias PartialTransferListProps<RecordType> = TransferListProps<RecordType>
typealias RenderListFunction<T> = (props: TransferListBodyProps<T>) -> ReactNode
