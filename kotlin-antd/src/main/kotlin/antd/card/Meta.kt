package antd.card

import react.*

external object CardMetaComponent : Component<CardMetaProps, RState> {
    override fun render(): ReactElement?
}

external interface CardMetaProps : RProps {
    var prefixCls: String?
    var style: dynamic
    var className: String?
    var avatar: Any? /* String | ReactElement */
    var title: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
}
