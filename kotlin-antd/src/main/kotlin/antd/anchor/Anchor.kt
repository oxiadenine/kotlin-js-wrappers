@file:JsModule("antd/lib/anchor")
@file:JsNonModule

package antd.anchor

import antd.*
import antd.ReactNode
import org.w3c.dom.*
import react.*

@JsName("default")
external object AnchorComponent : Component<AnchorProps, AnchorState> {
    val Link: AnchorLinkComponent

    override fun render(): ReactElement?
}

external interface AnchorProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var children: ReactNode?
    var offsetTop: Number?
    var bounds: Number?
    var affix: Boolean?
    var showInkInFixed: Boolean?
    var getContainer: (() -> AnchorContainer)?
    var getCurrentAnchor: (() -> String)?
    var onClick: ((e: MouseEvent<HTMLElement>, link: AnchorLink) -> Unit)?
    var targetOffset: Number?
    var onChange: ((currentActiveLink: String) -> Unit)?
}

external interface AnchorState : State {
    var activeLink: String?
}

external interface AntAnchor {
    var registerLink: (link: String) -> Unit
    var unregisterLink: (link: String) -> Unit
    var activeLink: String?
    var scrollTo: (link: String) -> Unit
    var onClick: ((e: MouseEvent<HTMLElement>, link: AnchorLink) -> Unit)?
}

external interface AnchorDefaultProps : AnchorProps {
    override var prefixCls: String?
    override var affix: Boolean?
    override var showInkInFixed: Boolean?
    override var getContainer: (() -> AnchorContainer)?
}

external interface AnchorLink {
    var title: ReactNode
    var href: String
}
