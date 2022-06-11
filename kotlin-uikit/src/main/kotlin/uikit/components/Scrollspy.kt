package uikit.components

import uikit.Component

external interface ScrollspyComponent : Component

external interface ScrollspyNavElement

external interface ScrollspyOptions {
    var cls: String?
    var hidden: Boolean?
    var offsetTop: Number?
    var offsetLeft: Number?
    var repeat: Boolean?
    var delay: Number?
}

external interface ScrollspyNavOptions {
    var cls: String?
    var closest: String?
    var scroll: Boolean?
    var overflow: Boolean?
    var offset: Number?
}

object ScrollspyEvents {
    const val inView = "inview"
    const val outView = "outview"
}

object ScrollspyNavEvents {
    const val active = "active"
}