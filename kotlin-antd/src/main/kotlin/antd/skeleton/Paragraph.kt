package antd.skeleton

import react.*

external interface SkeletonParagraphComponent : ComponentClass<SkeletonParagraphProps>

external interface SkeletonParagraphProps : Props {
    var prefixCls: String?
    var className: String?
    var style: dynamic
    var width: Any? /* WidthUnit | Array<WidthUnit> */
    var rows: Number?
}
