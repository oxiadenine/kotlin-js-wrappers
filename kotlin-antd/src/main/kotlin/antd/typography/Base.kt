package antd.typography

import antd.MouseEventHandler
import org.w3c.dom.HTMLElement
import react.*

external object BaseComponent : Component<BaseProps, BaseState> {
    override fun render(): ReactElement?
}

external interface BaseProps : InternalBlockProps, RProps

external interface BaseState : RState {
    var edit: Boolean
    var copied: Boolean
    var ellipsisText: String
    var ellipsisContent: Any /* String | ReactElement */
    var isEllipsis: Boolean
    var expanded: Boolean
    var clientRendered: Boolean
}

external interface InternalBlockProps : BlockProps, RProps {
    var component: String
}

external interface BlockProps : TypographyProps {
    var title: String?
    var editable: Any? /* Boolean | EditConfig */
    var copyable: Any? /* Boolean | CopyConfig */
    var type: BaseType?
    var disabled: Boolean?
    var ellipsis: Any? /* Boolean | EllipsisConfig */
    var code: Boolean?
    var mark: Boolean?
    var underline: Boolean?
    var delete: Boolean?
    var strong: Boolean?
    var keyboard: Boolean?
}

external interface CopyConfig {
    var text: String?
    var onCopy: (() -> Unit)?
    var icon: Any? /* String | ReactElement */
    var tooltips: Any? /* Boolean | String | ReactElement */
}

external interface EditConfig {
    var editing: Boolean?
    var icon: Any? /* String | ReactElement */
    var tooltip: Any? /* Boolean | String | ReactElement */
    var onStart: (() -> Unit)?
    var onChange: ((value: String) -> Unit)?
    var maxLength: Number?
    var autoSize: Any? /* Boolean | AutoSizeType */
}

external interface EllipsisConfig {
    var rows: Number?
    var expandable: Boolean?
    var suffix: String?
    var symbol: Any? /* String | ReactElement */
    var onExpand: MouseEventHandler<HTMLElement>?
    var onEllipsis: ((ellipsis: Boolean) -> Unit)?
}

external interface Locale {
    var edit: String?
    var copy: String?
    var copied: String?
    var expand: String?
}
