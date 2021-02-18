package antd.transfer

typealias TransferDirection = String /* "left" | "right" */
typealias RenderResult = Any /* ReactElement | RenderResultObject | String */
typealias KeyWiseTransferItem = Any /* TransferItem | KeyWise<TransferItem> */
typealias TransferRender<RecordType> = (item: RecordType) -> RenderResult
typealias SelectAllLabel = Any /* String | ReactElement | (info: SelectAllLabelInfo) -> Any /* String | ReactElement */) */
typealias PartialTransferListProps<RecordType> = TransferListProps<RecordType>
typealias RenderListFunction<T> = (props: TransferListBodyProps<T>) -> Any /* String | ReactElement */
