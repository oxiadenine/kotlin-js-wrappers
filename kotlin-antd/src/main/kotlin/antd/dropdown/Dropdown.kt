@file:JsModule("antd/lib/dropdown")
@file:JsNonModule

package antd.dropdown

import org.w3c.dom.*
import react.*

@JsName("default")
external object DropdownComponent : Component<DropdownProps, RState> {
    val Button: DropdownButtonComponent

    override fun render(): ReactElement?
}

external interface DropdownProps : RProps {
    var trigger: DropdownTrigger?
    var overlay: Any /* ReactElement | DropdownOverlayFunc */
    var onVisibleChange: ((visible: Boolean) -> Unit)?
    var visible: Boolean?
    var disabled: Boolean?
    var align: DropdownAlign?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var prefixCls: String?
    var className: String?
    var transitionName: String?
    var placement: DropdownPlacement?
    var overlayClassName: String?
    var overlayStyle: dynamic
    var forceRender: Boolean?
    var mouseEnterDelay: Number?
    var mouseLeaveDelay: Number?
    var openClassName: String?
}

external interface DropdownAlign {
    var points: Array<String>?
    var offset: Array<Number>?
    var targetOffset: Array<Number>?
    var overflow: DropdownAlignOverflow?
    var useCssRight: Boolean?
    var useCssBottom: Boolean?
    var useCssTransform: Boolean?
}

external interface DropdownAlignOverflow {
    var adjustX: Boolean
    var adjustY: Boolean
}
