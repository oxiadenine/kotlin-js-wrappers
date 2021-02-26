package antd.tooltip

import antd.ReactNode
import org.w3c.dom.Document
import org.w3c.dom.HTMLElement
import react.ReactElement

external interface TriggerProps {
    var children: ReactElement
    var action: Any /* ActionType | Array<ActionType> */
    var showAction: Array<ActionType>?
    var hideAction: Array<ActionType>?
    var getPopupClassNameFromAlign: ((align: AlignType) -> String)?
    var onPopupVisibleChange: ((visible: Boolean) -> Unit)?
    var afterPopupVisibleChange: ((visible: Boolean) -> Unit)?
    var popup: Any /* ReactNode | () -> ReactNode */
    var popupStyle: dynamic
    var prefixCls: String?
    var popupClassName: String?
    var className: String?
    var popupPlacement: String?
    var builtinPlacements: BuildInPlacements?
    var mouseEnterDelay: Number?
    var mouseLeaveDelay: Number?
    var zIndex: Number?
    var focusDelay: Number?
    var blurDelay: Number?
    var getPopupContainer: ((node: HTMLElement) -> HTMLElement)?
    var getDocument: ((element: HTMLElement?) -> Document)?
    var forceRender: Boolean?
    var destroyPopupOnHide: Boolean?
    var mask: Boolean?
    var maskClosable: Boolean?
    var onPopupAlign: ((element: HTMLElement, align: AlignType) -> Unit)?
    var popupAlign: AlignType?
    var popupVisible: Boolean?
    var defaultPopupVisible: Boolean?
    var autoDestroy: Boolean?
    var stretch: String?
    var alignPoint: Boolean?
    var popupMotion: dynamic
    var maskMotion: dynamic
    var popupTransitionName: TransitionNameType?
    var popupAnimation: AnimationType?
    var maskTransitionName: TransitionNameType?
    var maskAnimation: String?
    var getTriggerDOMNode: ((node: dynamic) -> HTMLElement)?
    var mobile: MobileConfig?
}

external interface AlignType {
    var points: Array<AlignPoint>?
    var offset: Array<Number>?
    var targetOffset: Array<Number>?
    var overflow: AlignTypeOverflow?
    var useCssRight: Boolean?
    var useCssBottom: Boolean?
    var useCssTransform: Boolean?
    var ignoreShake: Boolean?
}

external interface AlignTypeOverflow {
    var adjustX: Any? /* Boolean | Number */
    var adjustY: Any? /* Boolean | Number */
}

external interface BuildInPlacements

external interface MobileConfig {
    var popupMotion: dynamic
    var popupClassName: String
    var popupStyle: dynamic
    var popupRender: ((originNode: ReactNode) -> ReactNode)?
}
