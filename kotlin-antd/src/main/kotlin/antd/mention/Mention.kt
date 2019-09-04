@file:JsModule("antd/lib/mention")

package antd.mention

import antd.FocusEventHandler
import kotlinext.js.Object
import org.w3c.dom.Element
import org.w3c.dom.HTMLElement
import react.Component
import react.RProps
import react.RState
import react.ReactElement

@JsName("default")
external object MentionComponent : Component<MentionProps, MentionState> {
    fun getMentions(contentState: Any, prefix: String? = definedExternally): Array<String>

    val Nav: NavComponent

    fun toString(contentState: Any, options: Object): String
    fun toContentState(text: String): Any

    override fun render(): ReactElement?
}

external interface MentionProps : RProps {
    var prefixCls: String?
    var suggestionStyle: dynamic
    var defaultSuggestions: Array<SuggestionItme>?
    var suggestions: Array<Any /* String | SuggestionItem */>?
    var onSearchChange: ((value: String, trigger: String) -> Any)?
    var onChange: ((contentState: Any) -> Unit)?
    var notFoundContent: Any? /* String | RectElement */
    var loading: Boolean?
    var style: dynamic
    var defaultValue: Any?
    var value: Any?
    var className: String?
    var multiLines: Boolean?
    var prefix: Any? /* String | Array<String> */
    var placeholder: String?
    var getSuggestionContainer: ((triggerNode: Element) -> HTMLElement)?
    var onFocus: FocusEventHandler<HTMLElement>?
    var onBlur: FocusEventHandler<HTMLElement>?
    var onSelect: ((suggestion: String, data: Any?) -> Unit)?
    var readOnly: Boolean?
    var disabled: Boolean?
    var placement: MentionPlacement?
}

external interface MentionState : RState {
    var filteredSuggestions: Array<Any>?
    var focus: Boolean?
}
