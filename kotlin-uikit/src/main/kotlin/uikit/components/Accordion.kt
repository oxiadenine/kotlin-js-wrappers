package uikit.components

external interface AccordionElement {
    fun toggle(index: Any = definedExternally /* String | Int | Element */, animate: Boolean = definedExternally)
}

external interface AccordionOptions {
    var acttive: Number?
    var animation: Boolean?
    var collapsible: Boolean?
    var content: String?
    var duration: Number?
    var multiple: Boolean?
    var targets: String?
    var toggle: String?
    var transition: String?
    var offset: Number?
}

object AccordionEvents {
    const val beforeShow = "beforeshow"
    const val show = "show"
    const val shown = "shown"
    const val beforeHide = "beforehide"
    const val hide = "hide"
    const val hidden = "hidden"
}
