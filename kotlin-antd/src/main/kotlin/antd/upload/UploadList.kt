package antd.upload

import kotlinext.js.Object
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object UploadListComponent : Component<UploadListProps, RState> {
    override fun render(): ReactElement?
}

external interface UploadListProps : RProps {
    var listType: UploadListType?
    var onPreview: ((file: UploadFile) -> Unit)?
    var onRemove: ((file: UploadFile) -> Any /* Unit | Boolean */)?
    var items: Array<UploadFile>?
    var progressAttr: Object?
    var prefixCls: String?
    var showRemoveIcon: Boolean?
    var showPreviewIcon: Boolean?
    var locale: UploadLocale
    var previewFile: PreviewFileHandler?
}
