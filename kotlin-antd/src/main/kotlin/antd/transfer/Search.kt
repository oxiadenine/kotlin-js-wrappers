package antd.transfer

import antd.FormEvent
import antd.MouseEvent
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object TransferSearchComponent : Component<TransferSearchProps, RState> {
    override fun render(): ReactElement?
}

external interface TransferSearchProps : RProps {
    var prefixCls: String?
    var placeholder: String?
    var onChange: ((e: FormEvent<HTMLElement>) -> Unit)?
    var handleClear: ((e: MouseEvent<HTMLElement>) -> Unit)?
    var value: String?
    var disabled: Boolean?
}
