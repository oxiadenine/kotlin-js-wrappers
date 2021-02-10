package antd.grid

import react.RContext

external val rowContext: RContext<RowContextState>

external interface RowContextState {
    var gutter: Array<Number>?
    var wrap: Boolean?
}
