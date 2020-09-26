package antd.typography

import antd.configprovider.*
import react.*

external object BaseComponent : Component<BaseProps, BaseState> {
    override fun render(): ReactElement?
}

external interface BaseProps : InternalBlockProps, ConfigConsumerProps, RProps

external interface InternalBlockProps : BlockProps, RProps {
    var component: String
}

external interface BaseState : RState {
    var edit: Boolean
    var copied: Boolean
    var ellipsisText: String
    var ellipsisContent: Any /* String | ReactElement */
    var isEllipsis: Boolean
    var expanded: Boolean
    var clientRendered: Boolean
}

external interface BlockProps : TypographyProps {
    var editable: Any? /* Boolean | EditConfig */
    var copyable: Any? /* Boolean | CopyConfig */
    var type: BaseType?
    var disabled: Boolean?
    var ellipsis: Any? /* Boolean | EllipsisConfig */

    // decorations
    var code: Boolean?
    var mark: Boolean?
    var underline: Boolean?
    var delete: Boolean?
    var strong: Boolean?
}

external interface CopyConfig {
    var text: String?
    var onCopy: (() -> Unit)?
}

external interface EditConfig {
    var editing: Boolean?
    var onStart: (() -> Unit)?
    var onChange: ((value: String) -> Unit)?
}

external interface EllipsisConfig {
    var rows: Number?
    var expandable: Boolean?
    var onExpand: (() -> Unit)?
}

external interface Locale {
    var edit: String?
    var copy: String?
    var copied: String?
    var expand: String?
}
