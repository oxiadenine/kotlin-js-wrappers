package antd.alert

import react.*

external class ErrorBoundaryComponent : Component<ErrorBoundaryProps, ErrorBoundaryState> {
    override fun render(): ReactElement
}

external interface ErrorBoundaryProps : RProps {
    var message: Any? /* String | ReactElement */
    var description: Any? /* String | ReactElement */
}

external interface ErrorBoundaryState : RState {
    var error: Error?
    var info: ErrorBoundaryStateInfo
}

external interface ErrorBoundaryStateInfo {
    var componentStack: String?
}
