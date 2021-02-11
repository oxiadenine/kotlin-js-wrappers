package antd.input

import antd.*
import antd.configprovider.SizeType
import org.w3c.dom.*
import react.*

external object TextAreaComponent : Component<TextAreaProps, RState> {
    override fun render(): ReactElement?
}

external interface TextAreaProps : RcTextAreaProps, RProps {
    var allowClear: Boolean?
    var bordered: Boolean?
    var showCount: Boolean?
    override var maxLength: Number?
    var size: SizeType?
}

external interface RcTextAreaProps : TextareaHTMLAttributes<HTMLTextAreaElement> {
    var prefixCls: String?
    override var className: String?
    override var style: dynamic
    var autoSize: Any? /* Boolean | AutoSizeType */
    var onPressEnter: KeyboardEventHandler<HTMLTextAreaElement>?
    var onResize: ((size: OnResizeSizeObject) -> Unit)?
}

external interface OnResizeSizeObject {
    var width: Number
    var height: Number
}

external interface AutoSizeType {
    var minRows: Number?
    var maxRows: Number?
}
