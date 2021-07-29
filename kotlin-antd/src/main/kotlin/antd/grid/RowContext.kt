package antd.grid

import react.Context

external val rowContext: Context<RowContextState>

external interface RowContextState {
    var gutter: Array<Number>?
    var wrap: Boolean?
}
