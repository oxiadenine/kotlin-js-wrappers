package antd.message

typealias NoticeType = String /* "info" | "success" | "error" | "warning" | "loading" */

typealias ConfigContent = Any /* ReactElement | String */
typealias ConfigDuration = Any /* Number | (() -> Unit) */
typealias ConfigOnClose = () -> Unit
