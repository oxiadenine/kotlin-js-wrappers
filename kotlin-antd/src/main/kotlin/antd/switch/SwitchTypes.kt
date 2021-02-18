package antd.switch

import org.w3c.dom.events.MouseEvent

typealias SwitchSize = String /* "small" | "default" */
typealias SwitchChangeEventHandler = (checked: Boolean, event: MouseEvent) -> Unit
typealias SwitchClickEventHandler = SwitchChangeEventHandler
