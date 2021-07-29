package antd.transfer

import react.*

external class ListBodyComponent<RecordType : KeyWiseTransferItem> : Component<TransferListBodyProps<RecordType>, TransferListBodyState> {
    override fun render(): ReactElement?
}

external interface TransferListBodyProps<RecordType> : PartialTransferListProps<RecordType> {
    var filteredItems: Array<RecordType>
    var filteredRenderItems: Array<RenderedItem<RecordType>>
    var selectedKeys: Array<String>
}

external interface TransferListBodyState : State {
    var current: Number
}
