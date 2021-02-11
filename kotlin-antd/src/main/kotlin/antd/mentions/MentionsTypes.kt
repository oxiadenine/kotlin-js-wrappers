package antd.mentions

typealias Placement = String /* "top" | "bottom" */
typealias Direction = String /* "ltr" | "rtl" */

typealias FilterOption = (input: String, value: OptionProps) -> Boolean
typealias ValidateSearch = (text: String, props: RcMentionsProps) -> Boolean
