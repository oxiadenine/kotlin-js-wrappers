@file:JsModule("antd/lib/image")
@file:JsNonModule

package antd.image

import antd.ImgHTMLAttributes
import org.w3c.dom.HTMLImageElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object ImageComponent : Component<ImageProps, RState> {
    override fun render(): ReactElement?
}

external interface ImageProps : RcImageProps, RProps

external interface RcImageProps : ImgHTMLAttributes<HTMLImageElement> {
    override var src: String?
    var prefixCls: String?
    var previewPrefixCls: String?
    override var placeholder: dynamic /* String | ReactElement */
    var fallback: String?
    var preview: Any? /* Boolean | ImagePreviewType */
    var onPreviewClose: ((value: Boolean, prevValue: Boolean) -> Unit)?
    override var onClick: dynamic /* (e: MouseEvent<HTMLDivElement>) -> Unit */
}

external interface ImagePreviewType {
    var visible: Boolean?
    var onVisibleChange: ((value: Boolean, prevValue: Boolean) -> Unit)?
    var getContainer: Any? /* GetContainer | Boolean */
}
