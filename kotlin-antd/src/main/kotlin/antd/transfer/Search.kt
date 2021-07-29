package antd.transfer

import antd.*
import org.w3c.dom.*
import react.*

external object TransferSearchComponent : Component<TransferSearchProps, State> {
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
