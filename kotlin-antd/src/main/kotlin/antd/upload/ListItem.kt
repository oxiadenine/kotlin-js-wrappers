package antd.upload

import antd.RefAttributes
import antd.ReactNode
import antd.SyntheticEvent
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.*

external interface ListItemComponent : ComponentClass<ListItemProps>

external interface ListItemProps : RefAttributes<HTMLDivElement>, Props {
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
    var removeIcon: Any? /* ReactNode | (file: UploadFile) -> ReactNode */
    var downloadIcon: Any? /* ReactNode | (file: UploadFile) -> ReactNode */
    var iconRender: (file: UploadFile<Any>) -> ReactNode
    var actionIconRender: (customIcon: ReactNode, callback: () -> Unit, prefixCls: String, title: String?) -> ReactNode
    var itemRender: ItemRender<Any>
    var onPreview: (file: UploadFile<Any>, e: SyntheticEvent<HTMLElement, Event>) -> Unit
    var onClose: (file: UploadFile<Any>) -> Unit
    var onDownload: (file: UploadFile<Any>) -> Unit
    var progress: UploadListProgressProps?
}
