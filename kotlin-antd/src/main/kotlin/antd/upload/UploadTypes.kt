package antd.upload

import kotlin.js.*

typealias UploadFileStatus = String /* "error" | "success" | "done" | "uploading" | "removed" */
typealias UploadType = String /* "drag" | "select" */

typealias UploadActionFn = (file: RcFile) -> Any /* String | (file: RcFile) -> Promise<String> */
typealias UploadDataFn = (file: UploadFile) -> Any

typealias UploadListType = String /* "text" | "picture" | "picture-card" */
typealias PreviewFileHandler = (file: Any /* File | Blob */) -> Promise<String>
