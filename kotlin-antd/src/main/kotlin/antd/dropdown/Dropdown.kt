@file:JsModule("antd/lib/dropdown")
@file:JsNonModule

package antd.dropdown

import org.w3c.dom.*
import react.*

@JsName("default")
external object DropdownComponent : Component<DropdownProps, State> {
    val Button: DropdownButtonComponent

    override fun render(): ReactElement?
}

external interface DropdownProps : Props {
    var arrow: Boolean?
    var trigger: Array<String /* "click" | "hover" | "contextMenu" */>?
    var overlay: Any /* ReactElement | OverlayFunc */
    var onVisibleChange: ((visible: Boolean) -> Unit)?
    var visible: Boolean?
    var disabled: Boolean?
    var align: Align?
    var getPopupContainer: ((triggerNode: HTMLElement) -> HTMLElement)?
    var prefixCls: String?
    var className: String?
    var transitionName: String?
    var placement: Placement?
    var overlayClassName: String?
    var overlayStyle: dynamic
    var forceRender: Boolean?
    var mouseEnterDelay: Number?
    var mouseLeaveDelay: Number?
    var openClassName: String?
}

external interface Align {
    var points: Array<String>?
    var offset: Array<Number>?
    var targetOffset: Array<Number>?
    var overflow: AlignOverflow?
    var useCssRight: Boolean?
    var useCssBottom: Boolean?
    var useCssTransform: Boolean?
}

external interface AlignOverflow {
    var adjustX: Boolean
    var adjustY: Boolean
}
