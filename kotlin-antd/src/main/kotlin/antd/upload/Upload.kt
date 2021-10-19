@file:JsModule("antd/lib/upload")
@file:JsNonModule

package antd.upload

import antd.RefAttributes
import antd.ReactNode
import org.w3c.files.*
import react.*
import kotlin.js.Date

@JsName("default")
external class UploadComponent<T> : Component<UploadProps<T>, UploadState<T>> {
    companion object {
        val Dragger: DraggerComponent
    }

    override fun render(): ReactElement?
}

external interface UploadProps<T> : RefAttributes<Any>, Props {
    var type: UploadType?
    var name: String?
    var defaultFileList: Array<UploadFile<T>>?
    var fileList: Array<UploadFile<T>>?
    var action: Any? /* String | (file: RcFile) -> String | (file: RcFile) -> Promise<String> */
    var directory: Boolean?
    var data: Any? /* Object | (file: UploadFile<T>) -> dynamic */
    var method: String /* "POST" | "PUT" | "PATCH" | "post" | "put" | "patch" */
    var headers: HttpRequestHeader?
    var showUploadList: Any? /* Boolean | ShowUploadListInterface */
    var multiple: Boolean?
    var accept: String?
    var beforeUpload: ((file: RcFile, FileList: Array<RcFile>) -> Any /* Boolean | Promise<Any /* Unit | File | Blob */> */)?
    var onChange: ((info: UploadChangeParam<UploadFile<Any>>) -> Unit)?
    var listType: UploadListType?
    var className: String?
    var onPreview: ((file: UploadFile<T>) -> Unit)?
    var onDownload: ((file: UploadFile<T>) -> Unit)?
    var onRemove: ((file: UploadFile<T>) -> Any /* Unit | Boolean | Promise<Any /* Unit | Boolean */> */)?
    var supportServerRender: Boolean?
    var style: dynamic
    var disabled: Boolean?
    var prefixCls: String?
    var customRequest: ((option: RcCustomRequestOptions) -> Unit)?
    var withCredentials: Boolean?
    var openFileDialogOnClick: Boolean?
    var locale: UploadLocale?
    var id: String?
    var previewFile: PreviewFileHandler?
    var transformFile: TransformFileHandler?
    var iconRender: ((file: UploadFile<T>, listType: UploadListType?) -> ReactNode)?
    var isImageUrl: ((file: UploadFile<T>) -> Boolean)?
    var progress: UploadListProgressProps?
    var itemRender: ItemRender<T>?
}

external interface UploadState<T> : State {
    var fileList: Array<UploadFile<T>>
    var dragState: String
}

external interface HttpRequestHeader

external interface UploadFile<T> {
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
    var originFileObj: Any? /* File | Blob */
    var response: T?
    var error: Any?
    var linkProps: Any?
    var type: String
    var xhr: T?
    var preview: String?
}

external class RcFile : File {
    var uid: String
    val lastModifiedDate: Date
    val webkitRelativePath: String
}

external interface RcCustomRequestOptions {
    var onProgress: (event: RcCustomRequestOptionsOnProgressEvent, file: RcFile) -> Unit
    var onError: (error: Error, response: Any?, file: RcFile?) -> Unit
    var onSuccess: (response: dynamic, file: RcFile) -> Unit
    var data: dynamic
    var filename: String
    var file: RcFile
    var withCredentials: Boolean
    var action: String
    var headers: dynamic
}

external interface RcCustomRequestOptionsOnProgressEvent {
    var percent: Number
}

external interface UploadChangeParam<T : UploadFile<Any>> {
    var file: T
    var fileList: Array<UploadFile<Any>>
    var event: UploadChangeParamEvent?
}

external interface UploadChangeParamEvent {
    var percent: Number
}

external interface ShowUploadListInterface {
    var showRemoveIcon: Boolean?
    var showPreviewIcon: Boolean?
    var showDownloadIcon: Boolean?
    var removeIcon: Any /* ReactNode | (file: UploadFile) -> ReactNode */
    var downloadIcon: Any /* ReactNode | (file: UploadFile) -> ReactNode */
}

external interface UploadLocale {
    var uploading: String?
    var removeFile: String?
    var uploadError: String?
    var previewFile: String?
}
