package antd.upload

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object UploadListComponent : Component<UploadListProps<Any>, RState> {
    override fun render(): ReactElement?
}

external interface UploadListProps<T> : RProps {
    var listType: UploadListType?
    var onPreview: ((file: UploadFile<T>) -> Unit)?
    var onDownload: ((file: UploadFile<T>) -> Unit)?
    var onRemove: ((file: UploadFile<T>) -> Any /* Unit | Boolean */)?
    var items: Array<UploadFile<T>>?
    var progress: UploadListProgressProps?
    var prefixCls: String?
    var showRemoveIcon: Boolean?
    var showDownloadIcon: Boolean?
    var showPreviewIcon: Boolean?
    var removeIcon: Any? /* String | ReactElement | (file: UploadFile) -> Any /* String | ReactElement */ */
    var downloadIcon: Any? /* String | ReactElement | (file: UploadFile) -> Any /* String | ReactElement */ */
    var locale: UploadLocale?
    var previewFile: PreviewFileHandler?
    var iconRender: ((file: UploadFile<T>, listType: UploadListType?) -> Any /* String | ReactElement */)?
    var isImageUrl: ((file: UploadFile<T>) -> Boolean)?
    var appendAction: Any? /* String | ReactElement */
    var itemRender: ItemRender<T>?
}
