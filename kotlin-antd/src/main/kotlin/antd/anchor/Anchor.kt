@file:JsModule("antd/lib/anchor")

package antd.anchor

import antd.MouseEvent
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object AnchorComponent : Component<AnchorProps, AnchorState> {
    val Link: AnchorLinkComponent

    override fun render(): ReactElement?
}

external interface AnchorProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: ReactElement?
    var offsetTop: Number?
    var bounds: Number?
    var affix: Boolean?
    var showInkInFixed: Boolean?
    var getContainer: (() -> AnchorContainer)?
    var onClick: ((e: MouseEvent<HTMLElement>, link: AnchorLink) -> Unit)?
}

external interface AnchorState : RState {
    var activeLink: String?
}

external interface AntAnchor {
    var registerLink: (link: String) -> Unit
    var unregisterLink: (link: String) -> Unit
    var activeLink: String?
    var scrollTo: (link: String) -> Unit
    var onClick: ((e: MouseEvent<HTMLElement>, link: AnchorLink) -> Unit)?
}

external interface AnchorLink {
    var title: Any /* String | ReactElement */
    var href: String
}
