@file:JsModule("antd/lib/affix")

package antd.affix

import react.*

@JsName("default")
external object AffixComponent : Component<AffixProps, AffixState> {
    override fun render(): ReactElement?
}

external interface AffixProps : RProps {
    var offsetTop: Number?
    var offset: Number?
    var offsetBottom: Number?
    var style: dynamic
    var onChange: ((affixed: Boolean?) -> Unit)?
    var target: (() -> dynamic /* Window | HTMLElement */)?
    var prefixCls: String?
    var className: String?
}

external interface AffixState : RState {
    var affixStyle: dynamic
    var placeholderStyle: dynamic
    var status: AffixStatus
    var lastAffix: Boolean
    var prevTarget: Any /* Window | HTMLElement */
}

external enum class AffixStatus { NONE, PREPARE }
