@file:JsModule("antd/lib/checkbox")
@file:JsNonModule

package antd.checkbox

import antd.*
import org.w3c.dom.*
import org.w3c.dom.events.MouseEvent
import react.*

@JsName("default")
external object CheckboxComponent : Component<CheckboxProps, RState> {
    val Group: CheckboxGroupComponent

    override fun render(): ReactElement?
}

external interface CheckboxProps : AbstractCheckboxProps<CheckboxChangeEvent>, RefAttributes<HTMLInputElement>, RProps {
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
    var children: ReactNode?
    var id: String?
    var autoFocus: Boolean?
    var type: String?
}

external interface CheckboxChangeEvent {
    val target: CheckboxChangeEventTarget
    val stopPropagation: () -> Unit
    val preventDefault: () -> Unit
    val nativeEvent: MouseEvent
}

external interface CheckboxChangeEventTarget : CheckboxProps {
    override var checked: Boolean?
}
