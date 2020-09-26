package antd.skeleton

import react.*

external object SkeletonParagraphComponent : Component<SkeletonParagraphProps, RState> {
    override fun render(): ReactElement?
}

external interface SkeletonParagraphProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* WidthUnit | Array<WidthUnit> */
    var rows: Number?
}
