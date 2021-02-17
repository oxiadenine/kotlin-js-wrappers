package antd

typealias Breakpoint = String /* "xxl" | "xl" | "lg" | "md" | "sm" | "xs" */
typealias RenderFunction = () -> Any /* String | ReactElement */
typealias LiteralUnion<T, U> = Any /* T | U */
typealias PresetColorType = String /* "pink" | "red" | "yellow" | "orange" | "cyan" | "green" | "blue" | "purple" | "geekblue" | "magenta" | "volcano" | "gold" | "lime" */

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
