package reactresponsive

import react.ReactElement

typealias MediaQueryChildrenFn = (matches: Boolean) -> ReactElement

typealias MediaQueryType = String /* keyof MediaQueryTypes */

typealias MediaQueryMatcherOrientation = String /* "portrait" | "landscape" */
typealias MediaQueryMatcherScan = String /* "progressive" | "interlace" */
