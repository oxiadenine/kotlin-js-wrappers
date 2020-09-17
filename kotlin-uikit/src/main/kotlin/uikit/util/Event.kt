package uikit.util

import org.w3c.dom.events.Event

typealias OnFun = (
    targets: Any /* String | Array<String> | Element */,
    type: String,
    selector: String?,
    listener: (e: Event) -> Unit,
    useCapture: Boolean?) -> () -> OffFun

typealias OffFun = (
    targets: Any /* String | Array<String> | Element */,
    type: String,
    selector: String?,
    listener: (e: Event) -> Unit,
    useCapture: Boolean?) -> Unit

typealias OnceFun = (
    element: Any /* String | Array<String> | Element */,
    type: String,
    selector: String?,
    listener: (e: Event) -> Unit,
    useCapture: Boolean?,
    condition: ((e: Event) -> Boolean)?) -> OffFun
