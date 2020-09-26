package antd

import org.w3c.dom.*
import org.w3c.dom.events.*

typealias NativeAnimationEvent = Event
typealias NativeClipboardEvent = org.w3c.dom.clipboard.ClipboardEvent
typealias NativeCompositionEvent = org.w3c.dom.events.CompositionEvent
typealias NativeDragEvent = org.w3c.dom.DragEvent
typealias NativeFocusEvent = org.w3c.dom.events.FocusEvent
typealias NativeKeyboardEvent = org.w3c.dom.events.KeyboardEvent
typealias NativeMouseEvent = org.w3c.dom.events.MouseEvent
typealias NativeTouchEvent = Event
typealias NativePointerEvent = org.w3c.dom.pointerevents.PointerEvent
typealias NativeTransitionEvent = Event
typealias NativeUIEvent = org.w3c.dom.events.UIEvent
typealias NativeWheelEvent = org.w3c.dom.events.WheelEvent

external interface BaseSyntheticEvent<E, C, T> {
    var nativeEvent: E
    var currentTarget: C
    var target: T
    var bubbles: Boolean
    var cancelable: Boolean
    var defaultPrevented: Boolean
    var eventPhase: Number
    var isTrusted: Boolean
    fun preventDefault()
    fun isDefaultPrevented(): Boolean
    fun stopPropagation()
    fun isPropagationStopped(): Boolean
    fun persist()
    var timeStamp: Number
    var type: String
}

external interface SyntheticEvent<T, E> : BaseSyntheticEvent<E, T, EventTarget>

external interface ClipboardEvent<T> : SyntheticEvent<T, NativeClipboardEvent> {
    var clipboardData: DataTransfer
}

external interface CompositionEvent<T> : SyntheticEvent<T, NativeCompositionEvent> {
    var data: String
}

external interface DragEvent<T> : MouseEvent<T> {
    var dataTransfer: DataTransfer
}

external interface PointerEvent<T> : MouseEvent<T> {
    var pointerId: Number
    var pressure: Number
    var tiltX: Number
    var tiltY: Number
    var width: Number
    var height: Number
    var pointerType: String /* "mouse" | "pen" | "touch" */
    var isPrimary: Number
}

external interface FocusEvent<T> : SyntheticEvent<T, NativeFocusEvent> {
    var relatedTarget: EventTarget
    override var target: EventTarget
}

external interface FormEvent<T> : SyntheticEvent<T, Event>

external interface InvalidEvent<T> : SyntheticEvent<T, Event> {
    override var target: EventTarget
}

external interface ChangeEvent<T> : SyntheticEvent<T, Event> {
    override var target: EventTarget;
}

external interface KeyboardEvent<T> : SyntheticEvent<T, NativeKeyboardEvent> {
    var altKey: Boolean
    var charCode: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var key: String
    var keyCode: Number
    var locale: String
    var location: Number
    var metaKey: Boolean
    var repeat: Boolean
    var shiftKey: Boolean
    var which: Number
}

external interface MouseEvent<T> : SyntheticEvent<T, NativeMouseEvent> {
    var altKey: Boolean
    var button: Number
    var buttons: Number
    var clientX: Number
    var clientY: Number
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean?
    var movementX: Number
    var movementY: Number
    var pageX: Number
    var pageY: Number
    var relatedTarget: EventTarget
    var screenX: Number
    var screenY: Number
    var shiftKey: Boolean
}

external interface TouchEvent<T> : SyntheticEvent<T, NativeTouchEvent> {
    var altKey: Boolean

    /* var changedTouches: TouchList */
    var ctrlKey: Boolean
    fun getModifierState(key: String): Boolean
    var metaKey: Boolean
    var shivftKey: Boolean
    /* var targetTouches: TouchList */
    /* var touches: TouchList */
}

external interface UIEvent<T> : SyntheticEvent<T, NativeUIEvent> {
    var detail: Number
    /* var view: AbstractView */
}

external interface WheelEvent<T> : MouseEvent<T> {
    var deltaMode: Number
    var deltaX: Number
    var deltaY: Number
    var deltaZ: Number
}

external interface AnimationEvent<T> : SyntheticEvent<T, NativeAnimationEvent> {
    var animationName: String
    var elapsedTime: Number
    var pseudoElement: String
}

external interface TransitionEvent<T> : SyntheticEvent<T, NativeTransitionEvent> {
    var elapsedTime: Number
    var propertyName: String
    var pseudoElement: String
}

typealias EventHandler<E> = (event: E) -> Unit

typealias ClipboardEventHandler<T> = EventHandler<ClipboardEvent<T>>
typealias CompositionEventHandler<T> = EventHandler<CompositionEvent<T>>
typealias DragEventHandler<T> = EventHandler<DragEvent<T>>
typealias FocusEventHandler<T> = EventHandler<FocusEvent<T>>
typealias FormEventHandler<T> = EventHandler<FormEvent<T>>
typealias ChangeEventHandler<T> = EventHandler<ChangeEvent<T>>
typealias KeyboardEventHandler<T> = EventHandler<KeyboardEvent<T>>
typealias MouseEventHandler<T> = EventHandler<MouseEvent<T>>
typealias TouchEventHandler<T> = EventHandler<TouchEvent<T>>
typealias PointerEventHandler<T> = EventHandler<PointerEvent<T>>
typealias UIEventHandler<T> = EventHandler<UIEvent<T>>
typealias WheelEventHandler<T> = EventHandler<WheelEvent<T>>
typealias AnimationEventHandler<T> = EventHandler<AnimationEvent<T>>
typealias TransitionEventHandler<T> = EventHandler<TransitionEvent<T>>
