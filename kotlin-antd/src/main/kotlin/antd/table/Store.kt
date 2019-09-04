package antd.table

external fun createStore(initialState: dynamic): Store

external interface Store {
    var setState: (partial: dynamic) -> Unit
    var getState: () -> Any
    var subscribe: (listener: () -> Unit) -> () -> Unit
}
