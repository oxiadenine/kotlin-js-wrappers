package antd.transfer

typealias TransferDirection = String /* "left" | "right" */

typealias TransferRender = (item: TransferItem) -> RenderResult
typealias RenderResult = Any? /* ReactElement | RenderResultObject | String */

typealias RenderListFunction = (props: TransferListBodyProps) -> Any /* String | ReactElement */
