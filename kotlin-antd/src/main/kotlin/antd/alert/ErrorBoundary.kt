package antd.alert

import react.*

external interface ErrorBoundaryComponent : ComponentClass<ErrorBoundaryProps>

external interface ErrorBoundaryProps : Props {
    var message: ReactNode?
    var description: ReactNode?
}

external interface ErrorBoundaryState : State {
    var error: Error?
    var info: ErrorBoundaryStateInfo
}

external interface ErrorBoundaryStateInfo {
    var componentStack: String?
}
