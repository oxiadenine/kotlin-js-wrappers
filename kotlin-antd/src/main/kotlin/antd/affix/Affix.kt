@file:JsModule("antd/lib/affix")
@file:JsNonModule

package antd.affix

import react.*

@JsName("default")
external object AffixComponent : Component<AffixProps, AffixState> {
    override fun render(): ReactElement?
}

external interface AffixProps : Props {
    var offsetTop: Number?
    var offsetBottom: Number?
    var style: dynamic
    var onChange: ((affixed: Boolean?) -> Unit)?
    var target: (() -> Any /* Window | HTMLElement */)?
    var prefixCls: String?
    var className: String?
    var children: ReactElement
}

external interface AffixState : State {
    var affixStyle: dynamic
    var placeholderStyle: dynamic
    var status: AffixStatus
    var lastAffix: Boolean
    var prevTarget: Any /* Window | HTMLElement */
}

external enum class AffixStatus { NONE, PREPARE }
