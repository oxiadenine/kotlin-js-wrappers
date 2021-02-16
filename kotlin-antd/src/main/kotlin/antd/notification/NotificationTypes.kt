package antd.notification

import org.w3c.dom.HTMLDivElement

typealias Key = String

typealias NotificationPlacement = String /* "topLeft" | "topRight" | "bottomLeft" | "bottomRight" */
typealias IconType = String /* "success" | "info" | "error" | "warning" */

typealias NoticeFunc = (noticeProps: RcNoticeContent) -> Unit
typealias HolderReadyCallback = (div: HTMLDivElement, noticeProps: RcNoticeProps) -> Unit
