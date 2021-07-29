package antd.skeleton

import react.*

external interface SkeletonParagraphComponent : ComponentType<SkeletonParagraphProps>

external interface SkeletonParagraphProps : RProps {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* WidthUnit | Array<WidthUnit> */
    var rows: Number?
}
