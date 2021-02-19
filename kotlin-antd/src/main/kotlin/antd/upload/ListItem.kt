package antd.upload

import antd.SyntheticEvent
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.*

external object ListItemComponent : Component<ListItemProps, RState> {
    override fun render(): ReactElement?
}

external interface ListItemProps : RProps {
    var prefixCls: String?
    var className: String
    var style: dynamic
    var locale: UploadLocale
    var file: UploadFile<Any>
    var items: Array<UploadFile<Any>>
    var listType: UploadListType?
    var isImgUrl: ((file: UploadFile<Any>) -> Boolean)?
    var showRemoveIcon: Boolean?
    var showDownloadIcon: Boolean?
    var showPreviewIcon: Boolean?
    var removeIcon: Any? /* String | ReactElement | (file: UploadFile) -> Any /* String | ReactElement */ */
    var downloadIcon: Any? /* String | ReactElement | (file: UploadFile) -> Any /* String | ReactElement */ */
    var iconRender: (file: UploadFile<Any>) -> Any /* String | ReactElement */
    var actionIconRender: (customIcon: Any /* String | ReactElement */, callback: () -> Unit, prefixCls: String, title: String?) -> Any /* String | ReactElement */
    var itemRender: ItemRender<Any>
    var onPreview: (file: UploadFile<Any>, e: SyntheticEvent<HTMLElement, Event>) -> Unit
    var onClose: (file: UploadFile<Any>) -> Unit
    var onDownload: (file: UploadFile<Any>) -> Unit
    var progress: UploadListProgressProps?
}
