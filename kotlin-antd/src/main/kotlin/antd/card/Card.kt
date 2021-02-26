@file:JsModule("antd/lib/card")
@file:JsNonModule

package antd.card

import antd.*
import antd.tabs.TabsProps
import org.w3c.dom.*
import react.*

@JsName("default")
external object CardComponent : Component<CardProps, RState> {
    val Grid: CardGridComponent
    val Meta: CardMetaComponent

    override fun render(): ReactElement?
}

external interface CardProps : HTMLAttributes<HTMLDivElement>, RProps {
    var prefixCls: String?
    override var title: dynamic /* ReactNode */
    var extra: ReactNode?
    var bordered: Boolean?
    var headStyle: dynamic
    var bodyStyle: dynamic
    override var style: dynamic
    var loading: Boolean?
    var hoverable: Boolean?
    override var children: ReactNode?
    override var id: String?
    override var className: String?
    var size: CardSize?
    var type: CardType?
    var cover: ReactNode?
    var actions: Array<ReactNode>?
    var tabList: Array<CardTabListType>?
    var tabBarExtraContent: ReactNode?
    var onTabChange: ((key: String) -> Unit)?
    var activeTabKey: String?
    var defaultActiveTabKey: String?
    var tabProps: TabsProps?
}

external interface CardTabListType {
    var key: String
    var tab: ReactNode
    var disabled: Boolean?
}
