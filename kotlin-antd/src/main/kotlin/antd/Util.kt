package antd

typealias Breakpoint = String /* "xxl" | "xl" | "lg" | "md" | "sm" | "xs" */

external interface BreakpointMap {
    var xxl: String
    var xl: String
    var lg: String
    var md: String
    var sm: String
    var xs: String
}

external interface ScreenMap {
    var xxl: Boolean
    var xl: Boolean
    var lg: Boolean
    var md: Boolean
    var sm: Boolean
    var xs: Boolean
}

external interface ScreenSizeMap {
    var xxl: Number
    var xl: Number
    var lg: Number
    var md: Number
    var sm: Number
    var xs: Number
}
