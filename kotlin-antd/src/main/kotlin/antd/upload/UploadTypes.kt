package antd.upload

import antd.progress.ProgressProps
import react.ReactElement
import kotlin.js.*

typealias UploadFileStatus = String /* "error" | "success" | "done" | "uploading" | "removed" */
typealias UploadType = String /* "drag" | "select" */
typealias UploadListType = String /* "text" | "picture" | "picture-card" */
typealias UploadListProgressProps = ProgressProps
typealias ItemRender<T> = (originNode: ReactElement, file: UploadFile<T>, fileList: Array<UploadFile<T>>?) -> Any /* String | ReactElement */
typealias PreviewFileHandler = (file: Any /* File | Blob */) -> Promise<String>
typealias TransformFileHandler = (file: RcFile) -> Any /* String | Blob | File | Promise<Any /* String | Blob | File */> */
