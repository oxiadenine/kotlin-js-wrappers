package antd.mentions

typealias MentionPlacement = String /* "top" | "bottom" */

typealias FilterOption = (input: String, value: OptionProps) -> Boolean
typealias ValidateSearch = (text: String, props: RcMentionProps) -> Boolean
