@file:JsModule("antd/lib/upload")
@file:JsNonModule

package antd.upload

import org.w3c.files.*
import react.*
import kotlin.js.Date
import kotlin.js.Promise

@JsName("default")
external object UploadComponent : Component<UploadProps, UploadState> {
    val Dragger: DraggerComponent

    override fun render(): ReactElement?
}

external interface UploadProps : RProps {
    var type: UploadType?
    var name: String?
    var defaultFileList: Array<UploadFile>?
    var fileList: Array<UploadFile>?
    var action: Any? /* String | UploadActionFn */
    var directory: Boolean?
    var data: Any? /* Object | UploadDataFn */
    var headers: HttpRequestHeader?
    var showUploadList: Any? /* Boolean | ShowUploadListInterface */
    var multiple: Boolean?
    var accept: String?
    var beforeUpload: ((file: RcFile, FileList: Array<RcFile>) -> Any /* Boolean | Promise<Unit> */)?
    var onChange: ((info: UploadChangeParam<UploadFile>) -> Unit)?
    var listType: UploadListType?
    var className: String?
    var onPreview: ((file: UploadFile) -> Unit)?
    var onRemove: ((file: UploadFile) -> Any /* Unit | Boolean | Promise<Unit | Boolean> */)?
    var supportServerRender: Boolean?
    var style: dynamic
    var disabled: Boolean?
    var prefixCls: String?
    var customRequest: ((option: Any) -> Unit)?
    var withCredentials: Boolean?
    var openFileDialogOnClick: Boolean?
    var locale: UploadLocale?
    var id: String?
    var previewFile: PreviewFileHandler?
}

external interface UploadState : RState {
    var fileList: Array<UploadFile>
    var dragState: String
}

external interface HttpRequestHeader {
    /* [key: String]: String */
}

external interface UploadFile {
    var uid: String
    var size: Number
    var name: String
    var fileName: String?
    var lastModified: Number?
    var lastModifiedDate: Date?
    var url: String?
    var status: UploadFileStatus?
    var percent: Number?
    var thumbUrl: String?
    var originFileObj: File?
    var response: Any?
    var error: Any?
    var linkProps: Any?
    var type: String
}

external class RcFile : File {
    var uid: String
    val lastModifiedDate: Date
    val webkitRelativePath: String
}

external interface UploadChangeParam<T : UploadFile> {
    var file: T
    var fileList: Array<UploadFile>
    var event: UploadChangeParamEvent?
}

external interface UploadChangeParamEvent {
    var percent: Number
}

external interface ShowUploadListInterface {
    var showRemoveIcon: Boolean?
    var showPreviewIcon: Boolean?
}

external interface UploadLocale {
    var uploading: String?
    var removeFile: String?
    var uploadError: String?
    var previewFile: String?
}

external fun T(): Boolean
external fun fileToObject(file: RcFile): UploadFile
external fun genPercentAdd(): (s: Number) -> Number
external fun getFileItem(file: UploadFile, fileList: Array<UploadFile>): UploadFile
external fun removeFileItem(file: UploadFile, fileList: Array<UploadFile>): UploadFile?
external val isImageUrl: (file: UploadFile) -> Boolean
external fun previewImage(file: Any /* File | Blob */): Promise<String>
