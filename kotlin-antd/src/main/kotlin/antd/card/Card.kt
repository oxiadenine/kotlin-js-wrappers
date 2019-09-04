@file:JsModule("antd/lib/card")

package antd.card

import antd.HTMLAttributes
import org.w3c.dom.HTMLDivElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object CardComponent : Component<CardProps, RState> {
    val Grid: CardGridComponent
    val Meta: CardMetaComponent

    override fun render(): ReactElement?
}

external interface CardProps : HTMLAttributes<HTMLDivElement>, RProps {
    var prefixCls: String?
    override var title: dynamic /* String | ReactElement */
    var extra: Any? /* String | ReactElement */
    var bordered: Boolean?
    var headStyle: dynamic
    var bodyStyle: dynamic
    override var style: dynamic
    var loading: Boolean?
    var noHovering: Boolean?
    var hoverable: Boolean?
    override var children: ReactElement?
    override var id: String?
    override var className: String?
    var size: CardSize?
    var type: CardType?
    var cover: Any? /* String | ReactElement */
    var actions: Array<Any /* String | ReactElement */>?
    var tabList: Array<CardTabListType>?
    var onTabChange: ((key: String) -> Unit)?
    var activeTabKey: String?
    var defaultActiveTabKey: String?
}

external interface CardTabListType {
    var key: String
    var tab: ReactElement
    var disabled: Boolean?
}
