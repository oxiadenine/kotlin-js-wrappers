@file:JsModule("antd/lib/checkbox")

package antd.checkbox

import antd.KeyboardEventHandler
import antd.MouseEventHandler
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.MouseEvent
import react.*

@JsName("default")
external object CheckboxComponent : Component<CheckboxProps, RState> {
    val Group: CheckboxGroupComponent

    override fun render(): ReactElement?
}

external interface CheckboxProps : AbstractCheckboxProps<CheckboxChangeEvent>, RProps {
    var indeterminate: Boolean?
}

external interface AbstractCheckboxProps<T> {
    var prefixCls: String?
    var className: String?
    var defaultChecked: Boolean?
    var checked: Boolean?
    var style: dynamic
    var disabled: Boolean?
    var onChange: ((e: T) -> Unit)?
    var onClick: MouseEventHandler<HTMLElement>?
    var onMouseEnter: MouseEventHandler<HTMLElement>?
    var onMouseLeave: MouseEventHandler<HTMLElement>?
    var onKeyPress: KeyboardEventHandler<HTMLElement>?
    var onKeyDown: KeyboardEventHandler<HTMLElement>?
    var value: Any?
    var tabIndex: Number?
    var name: String?
    var children: ReactElement?
    var id: String?
    var autoFocus: Boolean?
}

external interface CheckboxChangeEventTarget : CheckboxProps {
    override var checked: Boolean?
}

external interface CheckboxChangeEvent {
    val target: CheckboxChangeEventTarget
    val stopPropagation: () -> Unit
    val preventDefault: () -> Unit
    val nativeEvent: MouseEvent
}
