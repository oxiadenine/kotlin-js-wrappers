package antd.transfer

import react.Component
import react.RState
import react.ReactElement

external class ListBodyComponent<RecordType : KeyWiseTransferItem> : Component<TransferListBodyProps<RecordType>, TransferListBodyState> {
    override fun render(): ReactElement?
}

external interface TransferListBodyProps<RecordType> : PartialTransferListProps<RecordType> {
    var filteredItems: Array<RecordType>
    var filteredRenderItems: Array<RenderedItem<RecordType>>
    var selectedKeys: Array<String>
}

external interface TransferListBodyState : RState {
    var current: Number
}
